package com.lin.factoryMethod.resourceFactory.impl;

import com.lin.factoryMethod.resourceFactory.IResourceLoader;
import com.lin.simpleFactory.Resource;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design_pattern_lin_nan.factoryMethod.resourceFactory.impl
 * @Date：2023/6/24 1:55
 * @Filename：FileResourceLoader
 * @description:
 */
public class FileResourceLoader implements IResourceLoader {
    @Override
    public Resource load(String url) {
        //todo 具体实现
        return new Resource(url);
    }
}
