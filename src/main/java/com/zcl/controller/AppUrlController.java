package com.zcl.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Spring MVC 使用SimpleUrlHandlerMapping做映射处理
 * Created by zcl on 2019-05-07.
 */
public class AppUrlController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws Exception {
        System.out.println("这个是SimpleUrlHandlerMapping");
        return null;
    }
}
