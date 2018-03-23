package com.github.since1986.learn.boot.step1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("app")
@Component
public class AppProperties {

    private String defaultCharacterEncoding;

    public String getDefaultCharacterEncoding() {
        return defaultCharacterEncoding;
    }

    public void setDefaultCharacterEncoding(String defaultCharacterEncoding) {
        this.defaultCharacterEncoding = defaultCharacterEncoding;
    }
}
