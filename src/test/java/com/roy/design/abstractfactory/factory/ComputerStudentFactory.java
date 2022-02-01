package com.roy.design.abstractfactory.factory;

import com.roy.design.abstractfactory.majorlecture.ComputerGrade1stMajorLecture;
import com.roy.design.abstractfactory.majorlecture.ComputerGrade2ndMajorLecture;
import com.roy.design.abstractfactory.student.ComputerStudent;
import com.roy.design.abstractfactory.student.Student;

public class ComputerStudentFactory implements StudentFactory {

    public Student getStudent() {
        Student computerStudent = new ComputerStudent();
        computerStudent.setGrade1stLecture(new ComputerGrade1stMajorLecture());
        computerStudent.setGrade2ndLecture(new ComputerGrade2ndMajorLecture());
        return computerStudent;
    }

}
