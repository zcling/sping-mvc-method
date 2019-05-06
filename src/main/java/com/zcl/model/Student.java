package com.zcl.model;

import org.springframework.stereotype.Component;

/**
 * Created by zcl on 2019-04-11.
 */
@Component
public class Student {
    private String name;
    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:"+name+"__"+"age:"+age;
    }
}
