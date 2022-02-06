package com.roy.design.proxy;

import com.roy.design.proxy.school.SchoolProxy;
import com.roy.design.proxy.student.Student;
import com.roy.design.proxy.student.StudentProxy;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Teacher {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void proxyPatternPractice() {

        SchoolProxy schoolProxy = new SchoolProxy();
        StudentProxy studentProxy1 = schoolProxy.getProxyStudent("학생1", "WRONG_PASSWORD");
        logger.info("비밀번호가 틀린 경우의 학생 정보: {}", studentProxy1);

        Student student1 = schoolProxy.getOriginStudent("오리진 학생", "PASSWORD");
        logger.info("이름: {}, 나이: {}, 1학년 성적표: {}, 2학년 성적표: {}",
                student1.getName(), student1.getAge(), student1.getGrade1Report(), student1.getGrade2Report());

        StudentProxy studentProxy2 = schoolProxy.getProxyStudent("프록시 학생", "PASSWORD");
        logger.info("이름: {}, 나이: {}, 1학년 성적표: {}, 2학년 성적표: {}",
                studentProxy2.getName(), studentProxy2.getAge(), studentProxy2.getGrade1Report(), studentProxy2.getGrade2Report());

    }

}
