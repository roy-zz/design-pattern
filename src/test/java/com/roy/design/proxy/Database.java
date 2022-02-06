package com.roy.design.proxy;

public class Database {
    public static String getGrade1Report(String name) {
        return String.format("%s의 1학년 성적은 A+", name);
    }

    public static String getGrade2Report(String name) {
        return String.format("%s의 2학년 성적은 B+", name);
    }

}
