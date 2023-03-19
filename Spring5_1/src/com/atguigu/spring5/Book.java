package com.atguigu.spring5;

/**
 * @Description Book类，演示使用set方法注入
 * @Author hliu
 * @Date 2023/3/18 19:36
 * @Version 1.0
 */
public class Book {

    //创建属性
    private String bname;
    private String bathor;
    private String address;

    /**
     * set方法注入
     */
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBathor(String bathor) {
        this.bathor = bathor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", bathor='" + bathor + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
