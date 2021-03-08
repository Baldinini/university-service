package com.example.universityservice.console.impl;

import com.example.universityservice.console.CommandHandler;
import com.example.universityservice.service.DepartmentService;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("4")
public class CountLectorsOfDepartmentCommandHandler implements CommandHandler {
    private final DepartmentService departmentService;

    @Autowired
    public CountLectorsOfDepartmentCommandHandler(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public void handle() {
        System.out.println("Please enter name of department");
        Scanner scanner = new Scanner(System.in);
        String nameOfDepartment = scanner.nextLine();
        try {
            int countAllLectors = departmentService.countAllEmploys(nameOfDepartment);
            System.out.println(countAllLectors);
        } catch (NullPointerException e) {
            System.out.println("Can't count employees of " + nameOfDepartment + " department!");
        }
    }
}
