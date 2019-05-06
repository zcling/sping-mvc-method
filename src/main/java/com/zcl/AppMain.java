package com.zcl;

import com.zcl.model.Student;
import com.zcl.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zcl on 2019-04-11.
 */
public class AppMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        StudentService studentService = (StudentService) applicationContext.getBean(StudentService.class);
        Student student=studentService.setData("测试",22);
        System.out.println(student.toString());
    }
}
