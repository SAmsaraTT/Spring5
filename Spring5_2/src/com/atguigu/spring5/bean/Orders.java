package com.atguigu.spring5.bean;

/**
 * @Description 测试Bean的生命周期
 * @Author hliu
 * @Date 2023/3/19 13:43
 * @Version 1.0
 */
public class Orders {
    private String oname;

    //无参构造
    public Orders() {
        System.out.println("Step1 执行无参构造器创建bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("Step2 调用set方法设置属性的值");
    }

    //初始化方法
    public void init() {
        System.out.println("Step3 执行初始化方法（需要配置）");
    }

    //销毁方法
    public void destroy() {
        System.out.println("Step5 执行销毁方法（需要配置）");
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oname='" + oname + '\'' +
                '}';
    }
}
