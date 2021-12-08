package com.epam.triangle.observer;

import com.epam.triangle.observer.TriangleObservable;

public interface Observer {
    void update(TriangleObservable event);
}
