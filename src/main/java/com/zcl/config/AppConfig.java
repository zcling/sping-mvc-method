package com.zcl.config;

import com.zcl.model.User;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * Created by zcl on 2019/5/13.
 */
@Configuration
//@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)})
@ComponentScan(basePackages = "com.zcl.*",includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)})
//@ComponentScans(value = {@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)})})
//注解扫描，意思排除controller注解在外的注解扫描
//包含controller的注解
//该注解可以重复注解，
public class AppConfig {
    @Bean
    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setName("测试");
        user.setPassword("1234");
        return user;
    }
}
