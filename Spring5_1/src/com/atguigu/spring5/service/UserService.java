package com.atguigu.spring5.service;

import com.atguigu.spring5.User;
import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;

/**
 * @Description 演示外部Bean
 * @Author hliu
 * @Date 2023/3/18 20:10
 * @Version 1.0
 */
public class UserService {
    //创建UserDao属性，并创建对应set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add............");
        userDao.update();
        //原始方式
//        UserDao userDao = new UserDaoImpl();
//        userDao.update();


    }
}
