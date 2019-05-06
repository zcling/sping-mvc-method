package com.zcl.service;

import com.zcl.mapper.IndexMapper;
import com.zcl.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zcl on 2019-04-11.
 */
@Service
public class StudentService {

    @Autowired
    private Student student;

    /*@Autowired
    private IndexMapper indexMapper;*/

    public Student setData(String name,Integer age){
        student.setAge(age);
        student.setName(name);
        return student;
    }
}
