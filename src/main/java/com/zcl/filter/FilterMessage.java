package com.zcl.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by zcl on 2019-05-05.
 */
public class FilterMessage implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String str = filterConfig.getInitParameter("namespace");
        System.out.println(str);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器一");
        filterChain.doFilter(servletRequest, servletResponse);
        /*HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();

        String path = request.getRequestURI();
        Integer uid = (Integer) session.getAttribute("userid");

        if (path.indexOf("/login") > -1) {//登录页面不过滤
            filterChain.doFilter(servletRequest, servletResponse);//递交给下一个过滤器
            throw new ServletException("不存在");
        }*/

    }

    @Override
    public void destroy() {

    }
}
