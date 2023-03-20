package com.atguigu.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @Description Join point
 * @Author hliu
 * @Date 2023/3/19 21:41
 * @Version 1.0
 */
@Component
public class User {
    public void add() {
        //int i = 1 / 0;
        System.out.println("add........");
    }
}
