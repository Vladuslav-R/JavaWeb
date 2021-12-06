package com.epam.triangle.logic;

import com.epam.triangle.entity.Triangle;

public class TriangleIdentifiable extends Triangle implements Observable {
    private final Integer id;

    public TriangleIdentifiable(Integer id, double aX, double aY, double bX, double bY, double cX, double cY) {
        super(aX, aY, bX, bY, cX, cY);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public void atach(Observer observer) {

    }

    @Override
    public void detach(Observer observer) {

    }

    @Override
    public void notefyObsrevers() {

    }
}
