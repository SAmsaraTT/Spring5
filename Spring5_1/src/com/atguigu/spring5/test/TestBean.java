package com.atguigu.spring5.test;

import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description 测试外部Bean的测试类
 * @Author hliu
 * @Date 2023/3/18 20:20
 * @Version 1.0
 */
public class TestBean {
    /**
     * 测试外部Bean
     */
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();
    }

    /**
     * 测试内部Bean
     */
    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");

        Emp emp = applicationContext.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    /**
     * 测试级联赋值
     */
    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean4.xml");

        Emp emp = applicationContext.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
