package com.example.universityservice.service;

import com.example.universityservice.model.Degree;
import com.example.universityservice.model.Department;
import com.example.universityservice.model.Lector;
import java.util.Map;

public interface DepartmentService {
    void save(Department department);

    Lector getHeadOfDepartment(String name);

    int countAllEmploys(String name);

    double getAverageSalaryOfDepartment(String name);

    Map<Degree, Long> getStatistic(String name);
}
