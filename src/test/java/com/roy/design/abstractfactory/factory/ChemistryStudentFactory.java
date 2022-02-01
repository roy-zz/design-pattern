package com.roy.design.abstractfactory.factory;

import com.roy.design.abstractfactory.majorlecture.ChemistryGrade1stMajorLecture;
import com.roy.design.abstractfactory.majorlecture.ChemistryGrade2ndMajorLecture;
import com.roy.design.abstractfactory.student.ChemistryStudent;
import com.roy.design.abstractfactory.student.Student;

public class ChemistryStudentFactory implements StudentFactory {

    public Student getStudent() {
        Student chemistryStudent = new ChemistryStudent();
        chemistryStudent.setGrade1stLecture(new ChemistryGrade1stMajorLecture());
        chemistryStudent.setGrade2ndLecture(new ChemistryGrade2ndMajorLecture());
        return chemistryStudent;
    }

}
