package com.example.demo.services.impl;

import com.example.demo.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"default","english"})//use this english  implementation as default if no active profile in application.properties
public class HelloWorldImpl implements HelloWorldService {
    private HelloWorldService helloWorldService;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Override
    public String sayHello() {
        return "Hello World!!";
    }
}
