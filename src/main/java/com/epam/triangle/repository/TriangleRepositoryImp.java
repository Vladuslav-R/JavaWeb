package com.epam.triangle.repository;

import com.epam.triangle.entity.Triangle;

import java.util.*;

public class TriangleRepositoryImp implements TriangleRepository {
   private Map<Integer, TriangleIdentifiable> store = new HashMap<>();
    @Override
    public void add(final  TriangleIdentifiable triangle) {

    }

    @Override
    public void delete(TriangleIdentifiable triangle) {

    }

    @Override
    public void update(TriangleIdentifiable triangle) {

    }

    @Override
    public List<TriangleIdentifiable> query(final Specification specification) {
        List<TriangleIdentifiable> triangles = new ArrayList<>();
        for(TriangleIdentifiable triangle:store.values())

        if (specification.specified(triangle)) {
            triangles.add(triangle);
        }return triangles;
    }

    @Override
    public List<TriangleIdentifiable> sort(Comparator<TriangleIdentifiable> comparator) {
        return null;
    }


}
