package com.lin.simpleFactory;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design_pattern_lin_nan.simpleFactory
 * @Date：2023/6/24 1:47
 * @Filename：ResourceLoadException
 * @description:
 */
public class ResourceLoadException extends RuntimeException {
    public ResourceLoadException() {
        super("资源加载错误");
    }

    public ResourceLoadException(String message){
        super(message);
    }
}
