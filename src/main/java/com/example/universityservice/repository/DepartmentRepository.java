package com.example.universityservice.repository;

import com.example.universityservice.model.Department;
import com.example.universityservice.model.Lector;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Query("SELECT d FROM Department d JOIN FETCH d.lectors WHERE d.name = :name")
    Optional<Department> findByName(String name);

    @Query("SELECT d.headOfDepartment FROM Department d WHERE d.name = :name")
    Optional<Lector> findHeadOfDepartmentByName(String name);

}
