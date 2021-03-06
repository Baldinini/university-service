package com.example.universityservice.dao;

import com.example.universityservice.model.Department;
import com.example.universityservice.model.Lector;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Query("SELECT d.headOfDepartment FROM Department d WHERE d.name = :name")
    Optional<Lector> findByName(String name);

}
