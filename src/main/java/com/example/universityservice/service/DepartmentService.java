package com.example.universityservice.service;

import com.example.universityservice.dto.DepartmentStatisticDto;
import com.example.universityservice.model.Lector;

public interface DepartmentService {
    Lector getHeadOfDepartment(String departmentName);

    DepartmentStatisticDto getDepartmentStatistic(String departmentName);

    int getAverageSalary(String departmentName);

    int countAllEmploys(String departmentName);
}
