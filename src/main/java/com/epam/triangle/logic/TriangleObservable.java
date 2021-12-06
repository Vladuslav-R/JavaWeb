package com.epam.triangle.logic;

import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;

import java.util.ArrayList;
import java.util.List;

public class TriangleObservable extends Triangle implements Observable {
    private final Integer id;
    public final List<Observer> observers = new ArrayList<>();

    public TriangleObservable(Integer id, double aX, double aY, double bX, double bY, double cX, double cY) {
        super(aX, aY, bX, bY, cX, cY);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public void setA(Point a) {
        super.setA(a);
        notefyObsrevers();
    }

    @Override
    public void setB(Point b) {
        super.setB(b);
    }

    @Override
    public void setC(Point c) {
        super.setC(c);
    }

    @Override
    public void atach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notefyObsrevers() {
        for (Observer observer:observers) {
            observer.update(this);
        }

    }
}
