package com.lin.Singleton;

import java.io.Serializable;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.Singleton
 * @Date：2023/6/26 3:46
 * @Filename：DclSingleton
 * @description: 双重检查锁单例的实现
 */
public class DclSingleton implements Serializable {
    // 1、 持有一个jvm全局唯一的实例
    // 创建对象，不是一个原子性操作，即使使用了双重检查锁，也课程在创建的过程中产生半初始化状态
    // volatile 1、保证内存可见   2、保证有序性
    // 事实上，1.9以上，不加volatile也可以，jvm内部处理有序性

    //持有一个jvm全局唯一的实例
    private static volatile DclSingleton instance;

    //构造器私有化
    private DclSingleton() {
        if(instance!=null){
            throw new RuntimeException("已经被构造了");
        }
    }

    ;

    //暴露一个方法用来获取实例
    public static DclSingleton getInstance() {
        if (null == instance) {
            synchronized (DclSingleton.class) {
                if (null == instance) {
                    instance = new DclSingleton();
                }
            }
        }
        return instance;
    }
    private Object readResolve(){
        return instance;
    }
}
