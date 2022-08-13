package com.example.springboot2demo4.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.Arrays;
import java.util.Collections;

@Configuration(proxyBeanMethods = true)//依赖的组件始终是单实例对象
public class MyRegistConfig {

    @Bean
    public ServletRegistrationBean<MyServlet> myServlet(){
        MyServlet myServlet = new MyServlet();
        return new ServletRegistrationBean<>(myServlet, "/my","/my02");
    }

    @Bean
    public FilterRegistrationBean<MyFilter> myFilter(){
        MyFilter myFilter = new MyFilter();
        FilterRegistrationBean<MyFilter> registrationBean = new FilterRegistrationBean<>(myFilter);
        registrationBean.setUrlPatterns(Collections.singletonList("/my"));
        return registrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean<MyServletContextListener> myListener(){
        MyServletContextListener listener = new MyServletContextListener();
        return new ServletListenerRegistrationBean<>(listener);
    }
}
