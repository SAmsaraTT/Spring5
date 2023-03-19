package com.atguigu.spring5.collectiontype;

import java.util.List;

/**
 * @Description
 * @Author hliu
 * @Date 2023/3/18 21:59
 * @Version 1.0
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Book{" +
                "list=" + list +
                '}';
    }
}
