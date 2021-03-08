package com.example.universityservice.console.impl;

import com.example.universityservice.console.CommandHandler;
import com.example.universityservice.model.Lector;
import com.example.universityservice.service.DepartmentService;
import java.util.NoSuchElementException;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("1")
public class HeadOfDepartmentCommandHandler implements CommandHandler {
    private final DepartmentService departmentService;

    @Autowired
    public HeadOfDepartmentCommandHandler(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public void handle() {
        System.out.println("Please enter name of department");
        Scanner scanner = new Scanner(System.in);
        String nameOfDepartment = scanner.nextLine();
        try {
            Lector headOfDepartment = departmentService.getHeadOfDepartment(nameOfDepartment);
            System.out.println(" Head of " + nameOfDepartment
                    + " department is " + headOfDepartment);
        } catch (NoSuchElementException e) {
            System.out.println("Can't get head of " + nameOfDepartment + " department!");
        }
    }
}
