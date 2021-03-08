package com.example.universityservice.service;

import com.example.universityservice.model.Lector;
import java.util.List;
import java.util.NoSuchElementException;

public interface LectorService {
    void save(Lector lector);

    List<Lector> findAll(String value) throws NoSuchElementException;
}
