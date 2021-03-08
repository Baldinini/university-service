package com.example.universityservice.console.impl;

import com.example.universityservice.console.CommandHandler;
import com.example.universityservice.service.DepartmentService;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("3")
public class AverageSalaryOfDepartmentCommandHandler implements CommandHandler {
    private final DepartmentService departmentService;

    @Autowired
    public AverageSalaryOfDepartmentCommandHandler(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public void handle() {
        System.out.println("Please enter name of department");
        Scanner scanner = new Scanner(System.in);
        String nameOfDepartment = scanner.nextLine();
        double averageSalaryOfDepartment;
        try {
            averageSalaryOfDepartment = departmentService
                    .getAverageSalaryOfDepartment(nameOfDepartment);
            System.out.println("The average salary of "
                    + nameOfDepartment + " is " + averageSalaryOfDepartment);
        } catch (NullPointerException e) {
            System.out.println("Can't get average salary for "
                    + nameOfDepartment + " department!");
        }
    }
}
