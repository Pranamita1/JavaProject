package com.collaboration.backend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc

@WebAppConfiguration

@ComponentScan(basePackages="com.collaboration.backend")

public class AppConfig {

}
