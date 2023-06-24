package com.lin.factoryMethod.resourceFactory;

import com.lin.simpleFactory.Resource;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design_pattern_lin_nan.factoryMethod.resourceFactory.impl
 * @Date：2023/6/24 1:32
 * @Filename：IResourceLoader
 * @description:
 */
public interface IResourceLoader {
    Resource load(String url);
}
