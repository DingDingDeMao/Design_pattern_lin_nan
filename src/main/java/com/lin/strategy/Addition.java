package com.lin.strategy;

import java.math.BigDecimal;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.strategy
 * @Date：2023/6/24 23:34
 * @Filename：Addition
 * @description: 加法
 */
public class Addition implements Operation{
    @Override
    public BigDecimal execute(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }
}
