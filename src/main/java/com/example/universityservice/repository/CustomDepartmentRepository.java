package com.example.universityservice.repository;

import com.example.universityservice.model.Degree;
import java.util.Map;

public interface CustomDepartmentRepository {
    Map<Degree, Long> getStatistic(String name);
}
