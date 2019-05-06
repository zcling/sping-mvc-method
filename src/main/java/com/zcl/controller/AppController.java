package com.zcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by zcl on 2019-05-05.
 */
@Controller
@RequestMapping("/")
public class AppController {
    @RequestMapping("/getMessage")
    public String getMessage() {
        System.out.println("测试");
        return "";
    }
}
