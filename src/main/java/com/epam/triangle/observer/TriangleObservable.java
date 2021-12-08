package com.epam.triangle.observer;

import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;

import java.util.ArrayList;
import java.util.List;

public class TriangleObservable extends Triangle implements Observable {
    private final Integer id;
    public final List<Observer> observers = new ArrayList<>();
    public Point a = new Point(1,1);
    public TriangleObservable(Integer id, Point a, Point b, Point c) {
        super(a, b, c);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public void setA(Point a) {
        super.setA(a);
        notifyObsrevers();
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
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObsrevers() {
        for (Observer observer : observers) {
            observer.update(this);
        }

    }
}
