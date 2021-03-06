package com.example.universityservice.dao;

import com.example.universityservice.model.Lector;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureDao extends JpaRepository<Lector, Long> {
}
