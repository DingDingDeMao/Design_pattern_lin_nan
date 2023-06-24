package com.lin.factoryMethod.resourceFactory.impl;

import com.lin.factoryMethod.resourceFactory.IResourceLoader;
import com.lin.simpleFactory.Resource;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design_pattern_lin_nan.factoryMethod.resourceFactory.impl
 * @Date：2023/6/24 1:53
 * @Filename：DefaultResourceLoader
 * @description:
 */
public class DefaultResourceLoader implements IResourceLoader {
    @Override
    public Resource load(String url) {
        //具体实现
        return new Resource(url);
    }
}
