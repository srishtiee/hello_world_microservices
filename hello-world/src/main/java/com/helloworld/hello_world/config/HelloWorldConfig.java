package com.helloworld.hello_world.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HelloWorldConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
