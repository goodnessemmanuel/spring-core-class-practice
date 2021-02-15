package com.example.demo.config;

import com.example.demo.services.HelloWorldService;
import com.example.demo.services.impl.HelloWorldFrenchImpl;
import com.example.demo.services.impl.HelloWorldEnglishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloWorldConfig {
    @Bean
    @Profile({"default","english"})//use this english  implementation as default if no active profile in application.properties
    public HelloWorldService helloWorldServiceEnglish(){
        return new HelloWorldEnglishImpl();
    }

    @Bean
    @Profile("french")
    public HelloWorldService helloWorldServiceFrench(){
        return new HelloWorldFrenchImpl();
    }
}
