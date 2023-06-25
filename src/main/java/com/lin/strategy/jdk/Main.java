package com.lin.strategy.jdk;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.strategy.jdk
 * @Date：2023/6/25 12:12
 * @Filename：Main
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("tom",12,89);
        Student student2 = new Student("jerry",15,74);
        Student student3 = new Student("lily",25,68);
        Student student4 = new Student("alin",19,10);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        //根据年龄进行排序
        list.sort(new AgeSort());
        System.out.println(list);

        //根据分数排序
        list.sort((s1,s2)->(int)(s1.getScore()-s2.getScore()));
        System.out.println(list);
    }
}
