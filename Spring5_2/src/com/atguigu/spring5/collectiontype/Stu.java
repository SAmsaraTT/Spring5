package com.atguigu.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Description 测试集合依赖注入
 * @Author hliu
 * @Date 2023/3/18 21:30
 * @Version 1.0
 */
public class Stu {
    //1数组类型属性
    private String[] courses;

    //2.list
    private List<String> list;

    //3.Map
    private Map<String, String> maps;

    //4.Set
    private Set<String> sets;

    //5。多门课程
    private List<Course> courseList;
    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                ", courseList=" + courseList +
                '}';
    }
}
