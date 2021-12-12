package com.epam.triangle.repository;

public class NameSpecification implements Specification {

    private final String name;

    public NameSpecification(final String name) {
        this.name = name;
    }

    @Override
    public boolean specified(TriangleIdentifiable triangle) {
        return triangle.getName().equals(name);
    }

}
