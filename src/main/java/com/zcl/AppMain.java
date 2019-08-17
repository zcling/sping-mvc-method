package com.zcl;

import com.zcl.config.AppConfig;
import com.zcl.model.Student;
import com.zcl.model.User;
import com.zcl.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

/**
 * Created by zcl on 2019-04-11.
 */

public class AppMain {

    public static void main(String[] args) {
       /* ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        StudentService studentService = (StudentService) applicationContext.getBean(StudentService.class);
        Student student=studentService.setData("测试",22);
        System.out.println(student.toString());
*/
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = (User) applicationContext.getBean(" t getUser");
    }

    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //User user = (User) applicationContext.getBean("getUser");
        String[] strings=applicationContext.getBeanDefinitionNames();
        //System.out.println(user);
        for (String name : strings) {
            System.out.println(name);
        }
    }


}
