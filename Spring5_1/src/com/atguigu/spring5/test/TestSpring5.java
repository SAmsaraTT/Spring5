package com.atguigu.spring5.test;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description 测试Spring5
 * @Author hliu
 * @Date 2023/3/18 18:03
 * @Version 1.0
 */
public class TestSpring5 {
    @Test
    public void testAdd() {
        //1.加载spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        User user = applicationContext.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    /**
    * @Description: 测试set方法依赖注入
    * @Param: []
    * @return: void
    * @Author: hliu
    * @Date: 2023/3/18
    */
    @Test
    public void testBook1() {
        //1.加载spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        Book book = applicationContext.getBean("book", Book.class);

        System.out.println(book);
    }

    /**
    * @Description: 测试有参构造器依赖注入的方法
    * @Param: []
    * @return: void
    * @Author: hliu
    * @Date: 2023/3/18
    */
    @Test
    public void testOrders() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = applicationContext.getBean("orders", Orders.class);

        System.out.println(orders);
    }
}
