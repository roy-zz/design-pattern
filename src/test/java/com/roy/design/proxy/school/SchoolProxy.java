package com.roy.design.proxy.school;

import com.roy.design.proxy.student.Student;
import com.roy.design.proxy.student.StudentProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("rawtypes")
public class SchoolProxy {
    private static final Logger LOGGER = LoggerFactory.getLogger(SchoolProxy.class);
    private static final School SCHOOL = new DefaultSchool();
    private static final String PASSWORD = "PASSWORD";

    public StudentProxy getProxyStudent(String name, String inputPassword) {
        if (isMatchedPassword(inputPassword)) {
            return SCHOOL.getProxyStudent(name);
        } else {
            LOGGER.info("학생 조회 실패");
            return null;
        }
    }

    public Student getOriginStudent(String name, String inputPassword) {
        if (isMatchedPassword(inputPassword)) {
            return SCHOOL.getOriginStudent(name);
        } else {
            LOGGER.info("학생 조회 실패");
            return null;
        }
    }

    private boolean isMatchedPassword(String inputPassword) {
        if (PASSWORD.equals(inputPassword)) {
            LOGGER.info("비밀번호 일치");
            return true;
        } else {
            LOGGER.info("비밀번호 불일치");
            return false;
        }
    }

}
