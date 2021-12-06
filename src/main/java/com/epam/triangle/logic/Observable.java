package com.epam.triangle.logic;

public interface Observable {
    void atach (Observer observer);
    void detach (Observer observer);
    void notefyObsrevers ();

}
