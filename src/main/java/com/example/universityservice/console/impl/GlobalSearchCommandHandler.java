package com.example.universityservice.console.impl;

import com.example.universityservice.console.CommandHandler;
import com.example.universityservice.model.Lector;
import com.example.universityservice.service.LectorService;
import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("5")
public class GlobalSearchCommandHandler implements CommandHandler {
    private final LectorService lectorService;

    @Autowired
    public GlobalSearchCommandHandler(LectorService lectorService) {
        this.lectorService = lectorService;
    }

    @Override
    public void handle() {
        System.out.println("Please enter string for searching");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        List<Lector> lectors = lectorService.findAll(value);
        if (!lectors.isEmpty()) {
            lectors.forEach(l -> System.out.println(l.getName() + " " + l.getLastname()));
            return;
        }
        System.out.println("There is no matching with " + value);
    }
}
