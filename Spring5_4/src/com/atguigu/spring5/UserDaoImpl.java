package com.atguigu.spring5;

/**
 * @Description
 * @Author hliu
 * @Date 2023/3/19 21:01
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了");
        return id;
    }
}
