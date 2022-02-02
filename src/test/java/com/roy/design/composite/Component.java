package com.roy.design.composite;

public abstract class Component {

    private final String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
