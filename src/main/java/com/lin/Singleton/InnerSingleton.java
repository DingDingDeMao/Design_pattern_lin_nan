package com.lin.Singleton;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.Singleton
 * @Date：2023/6/26 3:53
 * @Filename：InnerSingleton
 * @description: 静态内部类的方式实现单例
 */
public class InnerSingleton {
    //1、构造器私有化
    private InnerSingleton(){};

    //2、提供一个方法来获取单例
    public static InnerSingleton getInStance(){
        return InnerSingletonHolder.instance;
    }
     //3、定义内部类来持有实例
    // 特性，类加载的时机---> 一个类会在第一次主动使用的时候被加载
    // 实例会在内部类加载（调用getInstance方法的时候）会创建
    private static class  InnerSingletonHolder{
         private static final InnerSingleton instance = new InnerSingleton();
     }
}
