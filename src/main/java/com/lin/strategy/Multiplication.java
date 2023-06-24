package com.lin.strategy;

import java.math.BigDecimal;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.strategy
 * @Date：2023/6/24 23:37
 * @Filename：Multiplication
 * @description: 乘法
 */
public class Multiplication implements Operation{
    @Override
    public BigDecimal execute(BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }
}
