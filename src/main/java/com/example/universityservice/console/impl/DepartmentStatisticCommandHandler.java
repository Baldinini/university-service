package com.example.universityservice.console.impl;

import com.example.universityservice.console.CommandHandler;
import com.example.universityservice.model.Degree;
import com.example.universityservice.service.DepartmentService;
import java.util.Map;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("2")
public class DepartmentStatisticCommandHandler implements CommandHandler {
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentStatisticCommandHandler(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public void handle() {
        System.out.println("Please enter name of department");
        Scanner scanner = new Scanner(System.in);
        String nameOfDepartment = scanner.nextLine();
        Map<Degree, Long> statistic = departmentService.getStatistic(nameOfDepartment);
        if (!statistic.isEmpty()) {
            for (Map.Entry<Degree, Long> entry : statistic.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
            return;
        }
        System.out.println("Can't get statistic of " + nameOfDepartment + " department!");
    }
}
