package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description 测试注解
 * @Author hliu
 * @Date 2023/3/19 15:32
 * @Version 1.0
 */
//@Component(value = "userService")
//@Service
//@Controller
//@Repository
@Service
public class UserService {
    //定义dao类型属性
    //不需要set方法
//    @Autowired //根据类型
//    @Qualifier(value = "userDaoImpl1") //根据名称
//    private UserDao userDao;

    @Resource(name = "userDaoImpl1") //根据类型
    private UserDao userDao;

    @Value(value = "abc")
    private String name;

    public void add() {
        userDao.add();
        System.out.println("service add........");
        System.out.println(this.name);
    }
}
