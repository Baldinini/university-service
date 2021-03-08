package com.example.universityservice.service.impl;

import com.example.universityservice.model.Lector;
import com.example.universityservice.repository.LectorRepository;
import com.example.universityservice.service.LectorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LectorServiceImpl implements LectorService {
    private final LectorRepository lectorRepository;

    @Autowired
    public LectorServiceImpl(LectorRepository lectorRepository) {
        this.lectorRepository = lectorRepository;
    }

    @Override
    public void save(Lector lector) {
        lectorRepository.save(lector);
    }

    @Override
    public List<Lector> findAll(String value) {
        String fullValue = "%" + value + "%";
        return lectorRepository.findAll(fullValue);
    }
}
