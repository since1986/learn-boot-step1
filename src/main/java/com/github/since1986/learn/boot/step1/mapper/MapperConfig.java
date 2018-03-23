package com.github.since1986.learn.boot.step1.mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan(basePackageClasses = MapperConfig.class)
@Configuration
public class MapperConfig {
}
