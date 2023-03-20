package com.atguigu.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author hliu
 * @Date 2023/3/19 15:47
 * @Version 1.0
 */
@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add......");
    }
}
