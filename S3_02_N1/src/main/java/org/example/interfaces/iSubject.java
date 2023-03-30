package org.example.interfaces;


import org.example.domain.Observer;

public interface iSubject {
    void createObserver(String name);
    void deleteObserver(String name);
    void notifyObservers();

}
