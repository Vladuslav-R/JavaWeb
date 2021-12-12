package com.epam.triangle.repository;

import com.epam.triangle.entity.Triangle;

import java.util.Comparator;
import java.util.List;

public interface TriangleRepository {
    void add(TriangleIdentifiable triangle);

    void delete(TriangleIdentifiable triangle);

    void update(TriangleIdentifiable triangle);

    List<TriangleIdentifiable> query(Specification specification);

    List<TriangleIdentifiable> sort(Comparator<TriangleIdentifiable> comparator);
}
