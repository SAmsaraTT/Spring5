package com.atguigu.spring5.bean;

/**
 * @Description 测试内部Bean和级联赋值
 * @Author hliu
 * @Date 2023/3/18 20:25
 * @Version 1.0
 */
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
