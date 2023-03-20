package com.atguigu.spring5.autowire;

/**
 * @Description
 * @Author hliu
 * @Date 2023/3/19 14:14
 * @Version 1.0
 */
public class Emp {
    private Dept dept;

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
