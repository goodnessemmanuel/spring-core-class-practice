package springboot;

import com.example.demo.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo") //this helps when the program entry point is in a different package, as in this case
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");

        greetingController.sayHello();


    }

}
