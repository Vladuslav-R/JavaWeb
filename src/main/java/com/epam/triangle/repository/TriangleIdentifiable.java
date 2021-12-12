package com.epam.triangle.repository;

import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;

public class TriangleIdentifiable extends Triangle {

    public TriangleIdentifiable(Integer id, String name, Point a, Point b, Point c) {
        super(a, b, c);
        this.id = id;
    }

    private Integer id;

    public Integer getId() {
        return id;
    }

    private String name;

    public String getName() {
        return name;
    }
}
