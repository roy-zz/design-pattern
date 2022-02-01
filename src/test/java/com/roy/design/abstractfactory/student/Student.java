package com.roy.design.abstractfactory.student;

import com.roy.design.abstractfactory.majorlecture.MajorLecture;

public abstract class Student {
    protected MajorLecture grade1stLecture;
    protected MajorLecture grade2ndLecture;

    public void setGrade1stLecture(MajorLecture majorLecture) {
        this.grade1stLecture = majorLecture;
    }

    public void setGrade2ndLecture(MajorLecture majorLecture) {
        this.grade2ndLecture = majorLecture;
    }

    public MajorLecture getGrade1stLecture() {
        return this.grade1stLecture;
    }

    public MajorLecture getGrade2ndLecture() {
        return this.grade2ndLecture;
    }

}
