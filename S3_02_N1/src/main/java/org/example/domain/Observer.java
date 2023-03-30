package org.example.domain;

public class Observer {
    private String name;

    public Observer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void announce() {
        System.out.println(this.name + " notified");
    }

    @Override
    public String toString() {
        return "Observer name: " + name;
    }
}
