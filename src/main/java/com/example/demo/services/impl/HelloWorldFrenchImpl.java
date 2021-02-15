package com.example.demo.services.impl;

import com.example.demo.services.HelloWorldService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("french")
public class HelloWorldFrenchImpl implements HelloWorldService {
    @Override
    public String sayHello() {
        return "Hola Mundo!";
    }
}
