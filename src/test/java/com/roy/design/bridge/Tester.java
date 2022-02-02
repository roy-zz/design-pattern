package com.roy.design.bridge;

import com.roy.design.bridge.abstraction.ChemistryStudent;
import com.roy.design.bridge.abstraction.ComputerStudent;
import com.roy.design.bridge.abstraction.Student;
import com.roy.design.bridge.implementation.ChemistryUniversityLife;
import com.roy.design.bridge.implementation.ComputerUniversityLife;
import com.roy.design.bridge.implementation.UniversityLife;
import org.junit.jupiter.api.Test;

public class Tester {

    @Test
    void bridgePatternPractice() {
        UniversityLife chemistryUniversityLife = new ChemistryUniversityLife();
        UniversityLife computerUniversityLife = new ComputerUniversityLife();

        Student chemistryStudent = new ChemistryStudent(chemistryUniversityLife);
        chemistryStudent.goClassroom();
        chemistryStudent.takeMajorClass();

        Student computerStudent = new ComputerStudent(computerUniversityLife);
        computerStudent.goClassroom();
        computerStudent.takeMajorClass();
    }

}
