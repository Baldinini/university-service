package com.example.universityservice.console.impl;

import com.example.universityservice.console.CommandHandler;
import org.springframework.stereotype.Component;

@Component("exit")
public class ExitProgramCommandHandler implements CommandHandler {
    @Override
    public void handle() {
        System.exit(0);
    }
}
