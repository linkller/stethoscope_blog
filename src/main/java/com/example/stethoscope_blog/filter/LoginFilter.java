package com.example.stethoscope_blog.filter;

import com.example.stethoscope_blog.dao.map.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/login/login",filterName = "LogFilter")
public class LoginFilter implements Filter {

    @Autowired
    LogMapper loggeer;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest, servletResponse);
        loggeer.addLog("admin","login");
    }

    @Override
    public void destroy() {

    }
}
