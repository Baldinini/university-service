package com.example.universityservice.console.impl;

import com.example.universityservice.console.CommandHandler;
import org.springframework.stereotype.Component;

@Component
public class UnknownCommandHandler implements CommandHandler {
    @Override
    public void handle() {
        System.out.println("\nUnknown command. Please entry correct command");
    }
}
