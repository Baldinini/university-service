package com.example.universityservice.console.impl;

import com.example.universityservice.console.CommandHandler;
import org.springframework.stereotype.Component;

@Component("menu")
public class MenuCommandHandler implements CommandHandler {
    @Override
    public void handle() {
        System.out.println("\nPlease enter the number of the command "
                + "or exit for closing the program!");
        System.out.println("1 - Show head of department");
        System.out.println("2 - Show the department statistic");
        System.out.println("3 - Show the average salary for the department");
        System.out.println("4 - Show count of employee for the department");
        System.out.println("5 - Global searching");
        System.out.println("exit");
    }
}
