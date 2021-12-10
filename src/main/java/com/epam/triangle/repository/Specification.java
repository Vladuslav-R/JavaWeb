package com.epam.triangle.repository;

import com.epam.triangle.entity.Triangle;

public interface Specification {
    boolean specified(TriangleIdentifiable triangle);


}
