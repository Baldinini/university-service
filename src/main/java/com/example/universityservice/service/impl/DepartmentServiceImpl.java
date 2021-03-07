package com.example.universityservice.service.impl;

import com.example.universityservice.model.Degree;
import com.example.universityservice.model.Department;
import com.example.universityservice.model.Lector;
import com.example.universityservice.repository.DepartmentRepository;
import com.example.universityservice.service.DepartmentService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void save(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public Lector getHeadOfDepartment(String name) {
        return departmentRepository.findHeadOfDepartment(name).get();
    }

    @Override
    public int countAllEmploys(String name) {
        return departmentRepository.countAllEmployeesOfDepartment(name);
    }

    @Override
    public double getAverageSalaryOfDepartment(String name) {
        double averageSalaryOfDepartment = departmentRepository.getAverageSalaryOfDepartment(name);
        return Math.round(averageSalaryOfDepartment * 100) / 100.0;
    }

    @Override
    public Map<Degree, Long> getStatistic(String name) {
        return departmentRepository.getStatistic(name);
    }
}
