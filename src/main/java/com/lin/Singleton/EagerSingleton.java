package com.lin.Singleton;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.Singleton
 * @Date：2023/6/26 3:47
 * @Filename：EagerSingleton
 * @description:
 */
public class EagerSingleton {
    /**
     * 1、创建对象本身的复杂度
     * 很多的单例对象创建的过程可能及其复杂、
     * 很多单例对象创建完成后会占用很大内存，比如缓存对象
     * 很多单例对象创建完成后可能很小且很简单
     */
    //持有一个全局唯一的实例
    private final static EagerSingleton instance =new EagerSingleton();

    //为了避免别人来创建，要私有化构造器
    private EagerSingleton(){}

    //把实例对象暴露出去
    public static EagerSingleton getInstance(){
        return instance;
    }
}
