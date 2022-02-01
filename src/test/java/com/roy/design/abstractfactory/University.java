package com.roy.design.abstractfactory;

import com.roy.design.abstractfactory.factory.ChemistryStudentFactory;
import com.roy.design.abstractfactory.factory.ComputerStudentFactory;
import com.roy.design.abstractfactory.factory.StudentFactory;
import com.roy.design.abstractfactory.student.Student;
import org.junit.jupiter.api.Test;

public class University {

    @Test
    void abstractFactoryPatternPractice() {
        StudentFactory chemistryStudentFactory = new ChemistryStudentFactory();
        Student chemistryStudent = chemistryStudentFactory.getStudent();
        chemistryStudent.getGrade1stLecture().getLectures();
        chemistryStudent.getGrade2ndLecture().getLectures();

        StudentFactory computerStudentFactory = new ComputerStudentFactory();
        Student computerStudent = computerStudentFactory.getStudent();
        computerStudent.getGrade1stLecture().getLectures();
        computerStudent.getGrade2ndLecture().getLectures();
    }

}
