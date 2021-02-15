package com.example.demo.services.impl;

import com.example.demo.services.HelloWorldService;

public class HelloWorldFactory {
    public HelloWorldService createHelloWorldServices(String language){
        HelloWorldService helloWorldService = null;

        switch (language){
            case "en" :
                helloWorldService = new HelloWorldEnglishImpl();
                break;

            case "sp" :
                helloWorldService = new HelloWorldSpanishImpl();
                break;

            case "fr" :
                helloWorldService = new HelloWorldFrenchImpl();
                break;

            case "dt" :
                helloWorldService = new HelloWorldDutchImpl();
                break;

            default:
            return new HelloWorldEnglishImpl();
        }

        return helloWorldService;
    }
}
