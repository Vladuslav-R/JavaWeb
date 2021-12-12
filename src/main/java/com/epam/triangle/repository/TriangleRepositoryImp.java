package com.epam.triangle.repository;

import com.epam.triangle.entity.Triangle;

import java.util.*;

public class TriangleRepositoryImp implements TriangleRepository {
    private Map<Integer, TriangleIdentifiable> store = new HashMap<>();

    @Override
    public void add(final TriangleIdentifiable triangle) {
        store.put(triangle.getId(), triangle);
    }

    @Override
    public void delete(final TriangleIdentifiable triangle) {
        store.remove(triangle.getId());
    }

    @Override
    public void update(final TriangleIdentifiable triangle) {
        store.put(triangle.getId(), triangle);
    }

    @Override
    public List<TriangleIdentifiable> query(final Specification specification) {
        List<TriangleIdentifiable> triangles = new ArrayList<>();
        for (TriangleIdentifiable triangle : store.values()) {
            if (specification.specified(triangle)) {
                triangles.add(triangle);
            }
        }
        return triangles;
    }

    @Override
    public List<TriangleIdentifiable> sort(Comparator<TriangleIdentifiable> comparator) {
        List<TriangleIdentifiable> result = new ArrayList<>(store.values());
        result.sort(comparator);
        return result;
    }
}
