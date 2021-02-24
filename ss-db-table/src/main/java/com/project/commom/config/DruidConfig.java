package com.project.commom.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.project.modular.*.mapper")
public class DruidConfig {
}
