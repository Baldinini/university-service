package com.example.universityservice.service.impl;

import com.example.universityservice.dao.DepartmentRepository;
import com.example.universityservice.dto.DepartmentStatisticDto;
import com.example.universityservice.model.Lector;
import com.example.universityservice.service.DepartmentService;
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
    public Lector getHeadOfDepartment(String departmentName) {
        return departmentRepository.findByName(departmentName).get();
    }

    @Override
    public DepartmentStatisticDto getDepartmentStatistic(String departmentName) {
        return null;
    }

    @Override
    public int getAverageSalary(String departmentName) {
        return 0;
    }

    @Override
    public int countAllEmploys(String departmentName) {
        return 0;
    }
}
