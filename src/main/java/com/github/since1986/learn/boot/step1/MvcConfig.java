package com.github.since1986.learn.boot.step1;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.filter.HttpPutFormContentFilter;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.util.UrlPathHelper;

import java.nio.charset.Charset;
import java.util.List;

@ComponentScan
@Configuration
public class MvcConfig extends DelegatingWebMvcConfiguration {

    private final AppProperties appProperties;
    private final ObjectMapper objectMapper;

    @Autowired
    public MvcConfig(ObjectMapper objectMapper, AppProperties appProperties) {
        this.objectMapper = objectMapper;
        this.appProperties = appProperties;
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper urlPathHelper = new UrlPathHelper();
        urlPathHelper.setRemoveSemicolonContent(false); //相当于命名空间设置中的enable-matrix-variables
        urlPathHelper.setDefaultEncoding(appProperties.getDefaultCharacterEncoding());
        configurer.setUrlPathHelper(urlPathHelper);
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new MappingJackson2HttpMessageConverter(objectMapper));
        converters.add(new ByteArrayHttpMessageConverter());
        converters.add(new BufferedImageHttpMessageConverter());
        converters.add(new StringHttpMessageConverter(Charset.forName(appProperties.getDefaultCharacterEncoding())));
    }

    @Configuration
    static class FilterConfig {

        @Bean
        public FilterRegistrationBean httpPutFormContentFilter() {
            FilterRegistrationBean registration = new FilterRegistrationBean();
            HttpPutFormContentFilter httpPutFormContentFilter = new HttpPutFormContentFilter();
            registration.setFilter(httpPutFormContentFilter);
            registration.addUrlPatterns("/*");
            return registration;
        }
    }
}