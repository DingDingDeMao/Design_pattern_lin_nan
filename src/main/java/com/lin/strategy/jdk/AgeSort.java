package com.lin.strategy.jdk;

import java.util.Comparator;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.strategy.jdk
 * @Date：2023/6/25 12:08
 * @Filename：AgeSort
 * @description:
 */

public class AgeSort implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}
