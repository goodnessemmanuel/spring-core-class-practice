package com.example.demo.config;

import com.example.demo.services.HelloWorldService;
import com.example.demo.services.impl.HelloWorldFactory;
import com.example.demo.services.impl.HelloWorldFrenchImpl;
import com.example.demo.services.impl.HelloWorldEnglishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorldFactory helloWorldServiceFactory(){
        return new HelloWorldFactory();
    }

    @Bean
    @Profile({"default","english"})//use this english  implementation as default if no active profile in application.properties
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory){
        return factory.createHelloWorldServices("en");
    }

    @Bean
    @Profile("french")
    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory factory){
        return factory.createHelloWorldServices("fr");
    }
}
