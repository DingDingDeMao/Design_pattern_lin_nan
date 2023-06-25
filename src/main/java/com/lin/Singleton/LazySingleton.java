package com.lin.Singleton;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.Singleton
 * @Date：2023/6/26 3:58
 * @Filename：LazySingleton
 * @description:
 */
public class LazySingleton {
    // 1、 持有一个jvm全局唯一的实例
    private  static LazySingleton instance;
    //构造器私有化
    private LazySingleton(){};

    //暴露一个方法来获取实例
    public static LazySingleton getInstance(){
        if(null ==instance){
            instance =  new  LazySingleton();
        }
        return instance;
    }
}
