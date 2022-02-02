package com.roy.design.composite;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.roy.design.composite.JavaFile.FileType.*;

public class Tester {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void compositePatternPractice() {

        JavaFile chemistryStudent = new JavaFile(CLASS, "ChemistryStudent");
        JavaFile computerStudent = new JavaFile(CLASS, "ComputerStudent");
        JavaFile student = new JavaFile(ABSTRACT_CLASS, "Student");
        JavaFile chemistryUniversity = new JavaFile(CLASS, "ChemistryUniversityLife");
        JavaFile computerUniversity = new JavaFile(CLASS, "ComputerUniversityLife");
        JavaFile universityLife = new JavaFile(INTERFACE, "UniversityLife");
        JavaFile tester = new JavaFile(CLASS, "Tester");

        Package abstraction = new Package("abstraction");
            abstraction.addChild(chemistryStudent);
            abstraction.addChild(computerStudent);
            abstraction.addChild(student);
        Package implementation = new Package("implementation");
            implementation.addChild(chemistryUniversity);
            implementation.addChild(computerUniversity);
            implementation.addChild(universityLife);
        Package bridge = new Package("bridge");
            bridge.addChild(tester);
            bridge.addChild(abstraction);
            bridge.addChild(implementation);

        printComponent(bridge);
    }

    private void printComponent(Component component) {
        if (component instanceof Package) {
            Package aPackage = (Package) component;
            logger.info("{} | {}", aPackage.getClass().getSimpleName(), aPackage.getName());
            for (Component child : aPackage.getChildren()) {
                printComponent(child);
            }
        } else if (component instanceof JavaFile){
            JavaFile aJavaFile = (JavaFile) component;
            logger.info("{} | {} {}", aJavaFile.getClass().getSimpleName(), aJavaFile.getName(), aJavaFile.getFileType());
        }
    }

}
