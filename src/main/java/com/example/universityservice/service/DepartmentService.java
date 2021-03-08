package com.example.universityservice.service;

import com.example.universityservice.model.Degree;
import com.example.universityservice.model.Department;
import com.example.universityservice.model.Lector;
import java.util.Map;
import java.util.NoSuchElementException;

public interface DepartmentService {
    void save(Department department);

    Lector getHeadOfDepartment(String name) throws NoSuchElementException;

    Integer countAllEmploys(String name) throws NullPointerException;

    Double getAverageSalaryOfDepartment(String name) throws NullPointerException;

    Map<Degree, Long> getStatistic(String name);
}
