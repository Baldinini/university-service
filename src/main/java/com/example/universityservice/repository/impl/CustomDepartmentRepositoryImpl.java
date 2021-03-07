package com.example.universityservice.repository.impl;

import com.example.universityservice.model.Degree;
import com.example.universityservice.repository.CustomDepartmentRepository;
import java.util.Map;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Tuple;
import org.springframework.stereotype.Repository;

@Repository
public class CustomDepartmentRepositoryImpl implements CustomDepartmentRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Map<Degree, Long> getStatistic(String name) {
        return entityManager.createQuery("SELECT l.degree as degree, COUNT(l) as count "
                + "FROM departments d JOIN d.lectors l "
                + "WHERE d.name = :name "
                + "GROUP BY l.degree", Tuple.class)
                .setParameter("name", name)
                .getResultList()
                .stream()
                .collect(Collectors.toMap(tuple -> (Degree) tuple.get("degree"),
                        tuple -> (Long) tuple.get("count")));
    }
}
