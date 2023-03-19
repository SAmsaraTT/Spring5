package com.atguigu.spring5;

/**
 * @Description Orders类，测试有参构造器依赖注入
 * @Author hliu
 * @Date 2023/3/18 19:48
 * @Version 1.0
 */
public class Orders {
    private String oname;
    private String address;

    /**
     * 有参构造器
     * @param oname
     * @param address
     */
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oname='" + oname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
