package com.lin.factoryMethod;

import com.lin.simpleFactory.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design_pattern_lin_nan.factoryMrthod
 * @Date：2023/6/24 11:56
 * @Filename：factoryMrthodTest
 * @description:
 */
@Slf4j
public class factoryMethodTest {

    //简单工厂
    @Test
    public void testSimpleFactoryMethod(){
        String url = "http://www.baidu.com";
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource load = resourceLoader.load(url);
        System.out.println(load);
    }

    //工厂方法
    @Test
    public void factoryMethod(){
        String url = "https://www.baidu.com";
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource load = resourceLoader.load(url);
        System.out.println(load);
    }

    //工厂方法  版本三
    @Test
    public void factoryMethod2(){
        String url = "https://www.baidu.com";
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource load = resourceLoader.load(url);
        System.out.println(load);
    }
}
