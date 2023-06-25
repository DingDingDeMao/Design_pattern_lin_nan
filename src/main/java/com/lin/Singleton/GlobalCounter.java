package com.lin.Singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.Singleton
 * @Date：2023/6/26 4:11
 * @Filename：GlobalCounter
 * @description:
 */
public enum GlobalCounter {
    INSTANCE;

   private  AtomicLong instance =  new AtomicLong(0);

   public Long getNumber(){
       return instance.getAndIncrement();
   }
}
