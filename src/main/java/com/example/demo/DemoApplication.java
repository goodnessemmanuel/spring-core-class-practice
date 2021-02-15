package com.example.demo;

import com.example.demo.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");

        System.out.println(greetingController.sayHello());


    }

}
