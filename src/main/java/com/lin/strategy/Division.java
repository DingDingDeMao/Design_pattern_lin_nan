package com.lin.strategy;

import java.math.BigDecimal;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.strategy
 * @Date：2023/6/24 23:38
 * @Filename：Division
 * @description: 除法
 */
public class Division implements Operation{
    @Override
    public BigDecimal execute(BigDecimal num1, BigDecimal num2) {
        return num1.divide(num2,BigDecimal.ROUND_CEILING);
    }
}
