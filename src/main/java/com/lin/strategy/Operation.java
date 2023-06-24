package com.lin.strategy;

import java.math.BigDecimal;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.strategy
 * @Date：2023/6/24 23:32
 * @Filename：Operation
 * @description: 策略模式强调的是对算法的封装   工厂模式强调的是对对象的封装
 */
public interface Operation {
    BigDecimal execute(BigDecimal num1,BigDecimal num2);
}
