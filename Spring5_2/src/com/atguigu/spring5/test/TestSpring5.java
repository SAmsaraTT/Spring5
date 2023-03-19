package com.atguigu.spring5.test;

import com.atguigu.spring5.collectiontype.Book;
import com.atguigu.spring5.collectiontype.Stu;
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
     * 测试集注入
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
        Book book = applicationContext.getBean("book", Book.class);
        System.out.println(book);
    }
}
