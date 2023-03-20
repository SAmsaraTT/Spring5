package com.atguigu.spring5.test;

import com.atguigu.spring5.autowire.Emp;
import com.atguigu.spring5.bean.Orders;
import com.atguigu.spring5.collectiontype.Book;
import com.atguigu.spring5.collectiontype.Course;
import com.atguigu.spring5.collectiontype.Stu;
import com.atguigu.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description 测试类
 * @Author hliu
 * @Date 2023/3/18 21:41
 * @Version 1.0
 */
public class TestSpring5 {

    /**
     * 测试集合注入
     */
    @Test
    public void testCollections() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = applicationContext.getBean("stu", Stu.class);
        System.out.println(stu);
    }

    /**
     * 测试提取后注入
     */
    @Test
    public void testCollections1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");

        //测试单实例多实例(默认单实例）
        Book book1 = applicationContext.getBean("book", Book.class);
        Book book2 = applicationContext.getBean("book", Book.class);
        System.out.println(book1 == book2);
    }

    /**
     * 测试工厂bean
     */
    @Test
    public void testMyBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = applicationContext.getBean("myBean", Course.class);
        System.out.println(course);
    }

    /**
     * 测试bean生命周期
     */
    @Test
    public void testOrders() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean4.xml");
        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        Orders orders = applicationContext.getBean("orders", Orders.class);
        System.out.println("Step4 获取到了创建bean的实例对象");
        System.out.println(orders);

        //手动销毁
        ClassPathXmlApplicationContext c = (ClassPathXmlApplicationContext) applicationContext;

        c.close();
    }

    /**
     * 测试Autowired
     */
    @Test
    public void testAutoWired() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = applicationContext.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
