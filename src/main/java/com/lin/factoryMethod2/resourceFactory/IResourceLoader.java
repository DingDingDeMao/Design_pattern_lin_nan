package com.lin.factoryMethod2.resourceFactory;

import com.lin.factoryMethod2.product.AbstractResource;

/**
 * IResourceFactory
 * @author it楠老师
 * @createTime 2023-05-09
 */
public interface IResourceLoader {
    AbstractResource load(String url);
}
