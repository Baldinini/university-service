package com.example.universityservice.service;

import com.example.universityservice.model.Department;
import com.example.universityservice.model.Lector;

public interface DepartmentService {
    void save(Department department);

    Lector getHeadOfDepartment(String name);

    int countAllEmploys(String name);

    int getAverageSalaryOfDepartment(String name);

}
