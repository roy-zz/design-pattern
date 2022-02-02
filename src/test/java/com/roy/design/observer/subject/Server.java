package com.roy.design.observer.subject;

import com.roy.design.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Server {
    protected int cpuUsage = 0;
    protected int memoryUsage = 0;

    private final String name;
    private List<Observer> observers = new ArrayList<>();

    protected Server(String name) {
        this.name = name;
    }

    public abstract void useServer();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notify(int cpuUsage, int memoryUsage) {
        observers.forEach(i -> i.update(name, cpuUsage, memoryUsage));
    }

}
