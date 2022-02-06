package com.roy.design.proxy.student;

import com.roy.design.proxy.Database;

import java.util.Objects;

public class StudentProxy extends Student {

    public StudentProxy(String name, String age) {
        super(name, age);
    }

    public String getName() {
        return super.getName();
    }

    public String getAge() {
        return super.getAge();
    }

    public String getGrade1Report() {
        if (Objects.isNull(grade1Report)) {
            this.grade1Report = Database.getGrade1Report(this.name);
        }
        return super.getGrade1Report();
    }

    public String getGrade2Report() {
        if (Objects.isNull(grade2Report)) {
            this.grade2Report = Database.getGrade2Report(this.name);
        }
        return super.getGrade2Report();
    }

}
