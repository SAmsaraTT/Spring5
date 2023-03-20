package com.atguigu.spring5.test;

import com.atguigu.spring5.aopanno.User;
import com.atguigu.spring5.aopanno.UserProxy;
import com.atguigu.spring5.aopxml.Book;
import com.atguigu.spring5.config.ConfigAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description 测试类
 * @Author hliu
 * @Date 2023/3/19 21:52
 * @Version 1.0
 */
public class TestAOP {
    /**
     * 测试注解版AOP
     */
    @Test
    public void testAop() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        User user = applicationContext.getBean("user", User.class);
        user.add();

    }

    /**
     * 测试XML版AOP
     */
    @Test
    public void testAop1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = applicationContext.getBean("book", Book.class);
        book.buy();

    }

    /**
     * 测试注解版配置AOP
     */
    @Test
    public void testAop2() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = applicationContext.getBean("user", User.class);
        user.add();

    }

}
