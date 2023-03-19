package com.atguigu.spring5.collectiontype;

/**
 * @Description 课程类
 * @Author hliu
 * @Date 2023/3/18 21:49
 * @Version 1.0
 */
public class Course {
    private String cname; //课程的名称

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
