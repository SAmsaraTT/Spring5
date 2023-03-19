package com.atguigu.spring5.bean;

/**
 * @Description 员工类
 * @Author hliu
 * @Date 2023/3/18 20:26
 * @Version 1.0
 */
public class Emp {
    private String ename;
    private String gender;

    private Dept dept;

    //生成get方法

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
