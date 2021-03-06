package com.example.universityservice.service;

import com.example.universityservice.model.Lector;

public interface LectorService {
    void save(Lector lector);

    Lector getLector(Long id);
}
