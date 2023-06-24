package com.lin.factoryMethod2.product;

import java.io.InputStream;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design_pattern_lin_nan.factoryMethod2.product
 * @Date：2023/6/24 15:12
 * @Filename：AbstractResource
 * @description:
 */
public abstract class AbstractResource {
    private String url;

    public AbstractResource() {
    }

    public AbstractResource(String url) {
        this.url = url;
    }
    protected void shard(){
        System.out.println("这是共享方法");
    }

    //每个子类都需要实现的方法
    public abstract InputStream getInputStream();
}
