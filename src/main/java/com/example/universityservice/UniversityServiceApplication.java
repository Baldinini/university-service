package com.example.universityservice;

import com.example.universityservice.console.Application;
import com.example.universityservice.console.CommandHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UniversityServiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(UniversityServiceApplication.class, args);

        Application application = new Application(context.getBeansOfType(CommandHandler.class));
        application.run();
    }
}
