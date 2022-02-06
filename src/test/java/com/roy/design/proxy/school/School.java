package com.roy.design.proxy.school;

import com.roy.design.proxy.student.Student;
import com.roy.design.proxy.student.StudentProxy;

public interface School {
    StudentProxy getProxyStudent(String name);
    Student getOriginStudent(String name);
}
