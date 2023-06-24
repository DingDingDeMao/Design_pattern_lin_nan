package com.lin.simpleFactory;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design_pattern_lin_nan.simpleFactory
 * @Date：2023/6/24 1:36
 * @Filename：ResourceFactory
 * @description:
 */
public class ResourceFactory {
    public static Resource create(String type,String url){
        if("http".equals(type)){
            //todo 具体实现
            return new Resource(url);
        }else if("file".equals(type)){
            //todo 具体实现
            return new Resource(url);
        } else if ("classpath".equals(type)) {
            //todo 具体实现
            return new Resource(url);
        }else {
            return new Resource("default");
        }
    }
}
