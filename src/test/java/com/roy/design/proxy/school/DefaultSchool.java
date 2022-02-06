package com.roy.design.proxy.school;

import com.roy.design.proxy.student.Student;
import com.roy.design.proxy.student.StudentProxy;

public class DefaultSchool implements School {
    @Override
    public StudentProxy getProxyStudent(String name) {
        return new StudentProxy(name, "20");
    }

    @Override
    public Student getOriginStudent(String name) {
        return new Student(name, "20");
    }

}
