package com.atguigu.spring5.test;

import com.atguigu.spring5.config.SpringConfig;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description 测试类
 * @Author hliu
 * @Date 2023/3/19 15:35
 * @Version 1.0
 */
public class TestSpring5 {
    /**
     * 测试注解
     */
    @Test
    public void testService() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();
    }

    /**
     * 测试完全注解开发的配置类
     */
    @Test
    public void testService1() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();
    }
}
