package com.lin.factoryMethod2.product.impl;

import com.lin.factoryMethod2.product.AbstractResource;

import java.io.InputStream;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design_pattern_lin_nan.factoryMethod2.product.impl
 * @Date：2023/6/24 15:23
 * @Filename：FileResource
 * @description:
 */
public class FileResource extends AbstractResource {
    public FileResource() {
    }

    public FileResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
