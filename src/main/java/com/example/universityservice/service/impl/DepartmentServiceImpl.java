package com.example.universityservice.service.impl;

import com.example.universityservice.model.Department;
import com.example.universityservice.model.Lector;
import com.example.universityservice.repository.DepartmentRepository;
import com.example.universityservice.service.DepartmentService;
import java.util.List;
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
        return departmentRepository.findHeadOfDepartmentByName(name).get();
    }

    @Override
    public int countAllEmploys(String name) {
        return departmentRepository.findByName(name).get().getLectors().size();
    }

    @Override
    public int getAverageSalaryOfDepartment(String name) {
        Department department = departmentRepository.findByName(name).get();
        List<Lector> lectors = department.getLectors();
        int sum = 0;
        for (Lector lector: lectors) {
            sum += lector.getSalary();
        }
        return sum / lectors.size();
    }
}
