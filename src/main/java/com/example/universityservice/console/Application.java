package com.example.universityservice.console;

import com.example.universityservice.console.impl.MenuCommandHandler;
import com.example.universityservice.console.impl.UnknownCommandHandler;
import java.util.Map;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Application {
    private final Map<String, CommandHandler> commandHandlers;

    @Autowired
    public Application(Map<String, CommandHandler> commandHandlers) {
        this.commandHandlers = commandHandlers;
    }

    public void run() {
        new MenuCommandHandler().handle();
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        handleCommand(command);
    }

    private void handleCommand(String command) {
        while (true) {
            if (command.equals("menu")) {
                new MenuCommandHandler().handle();
                Scanner scanner = new Scanner(System.in);
                handleCommand(scanner.nextLine());
            }
            commandHandlers.getOrDefault(command, new UnknownCommandHandler()).handle();
            command = "menu";
        }
    }
}
