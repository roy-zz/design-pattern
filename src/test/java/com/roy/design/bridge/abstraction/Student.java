package com.roy.design.bridge.abstraction;

import com.roy.design.bridge.implementation.UniversityLife;

public abstract class Student {
    private final UniversityLife universityLife;

    protected Student(UniversityLife universityLife) {
        this.universityLife = universityLife;
    }

    public void goClassroom() {
        universityLife.goClassRoom();
    }

    public void takeMajorClass() {
        universityLife.takeMajorClass();
    }

}
