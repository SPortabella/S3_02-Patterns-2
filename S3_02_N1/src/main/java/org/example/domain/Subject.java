package org.example.domain;

import org.example.interfaces.iSubject;

import java.util.ArrayList;
import java.util.List;

public class Subject implements iSubject {
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void createObserver(String name) {
        observerList.add(new Observer(name));
    }

    @Override
    public void deleteObserver(String name) {
        observerList.removeIf(observer1 -> observer1.getName().equals(name));
    }

    @Override
    public void notifyObservers() {
        observerList.stream().forEach(observer -> observer.announce());
    }

    public void listObservers() {
        observerList.stream().forEach(observer -> System.out.println(observer));
    }
}
