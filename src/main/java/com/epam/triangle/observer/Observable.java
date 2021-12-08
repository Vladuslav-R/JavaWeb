package com.epam.triangle.observer;

public interface Observable {
    void attach (Observer observer);
    void detach (Observer observer);
    void notifyObsrevers ();

}
