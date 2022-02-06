package com.roy.design.proxy.student;

public class Student {
    protected String name;
    protected String age;
    protected String grade1Report;
    protected String grade2Report;

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGrade1Report() {
        return grade1Report;
    }

    public String getGrade2Report() {
        return grade2Report;
    }

}
