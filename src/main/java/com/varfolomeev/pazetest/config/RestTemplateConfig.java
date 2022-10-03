package com.varfolomeev.pazetest.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.time.Duration;

@Configuration
public class RestTemplateConfig {

    private RestTemplate restTemplate;

    @PostConstruct
    public void init() {
        initRestTemplate();
    }

    @Bean
    public  RestTemplate getRestTemplate() {return this.restTemplate;}

    private void  initRestTemplate() {
        RestTemplateBuilder builder = new  RestTemplateBuilder();
        this.restTemplate = builder
                .setConnectTimeout(Duration.ofMillis(5000))
                .setReadTimeout(Duration.ofMillis(120000))
                .build();
    }
}
