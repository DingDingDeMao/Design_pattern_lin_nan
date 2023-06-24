package com.lin.factoryMethod2.resourceFactory.impl;


import com.lin.factoryMethod2.product.AbstractResource;
import com.lin.factoryMethod2.product.impl.FileResource;
import com.lin.factoryMethod2.resourceFactory.IResourceLoader;

/**
 * @author it楠老师
 * @createTime 2023-05-09
 */
public class FtpResourceLoader implements IResourceLoader {
    @Override
    public AbstractResource load(String url) {
        // 中间省略复杂的创建过程
        return new FileResource(url);
    }
}
