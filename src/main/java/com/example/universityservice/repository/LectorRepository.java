package com.example.universityservice.repository;

import com.example.universityservice.model.Lector;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LectorRepository extends JpaRepository<Lector, Long> {
    @Query(value = "SELECT l FROM lectors l WHERE l.name LIKE :value OR l.lastname LIKE :value")
    List<Lector> findAll(String value);
}
