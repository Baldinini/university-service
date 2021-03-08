package com.example.universityservice.repository;

import com.example.universityservice.model.Department;
import com.example.universityservice.model.Lector;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Long>,
        CustomDepartmentRepository {
    @Query(value = "SELECT d.headOfDepartment FROM departments d"
            + " JOIN d.headOfDepartment WHERE d.name = :name")
    Optional<Lector> findHeadOfDepartment(String name);

    @Query(value = "SELECT d.lectors.size FROM departments d WHERE d.name = :name")
    Integer countAllEmployeesOfDepartment(String name);

    @Query(value = "SELECT AVG (l.salary) FROM departments d JOIN d.lectors l WHERE d.name = :name")
    Double getAverageSalaryOfDepartment(String name);
}
