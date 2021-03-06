package com.example.universityservice.dto;

import com.example.universityservice.model.Degree;
import com.example.universityservice.model.Department;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

@Data
public class DepartmentStatisticDto {
    private Department department;
    private Map<Degree, Integer> departmentStatistic = new HashMap<>();
}
