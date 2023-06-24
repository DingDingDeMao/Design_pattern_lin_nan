package com.lin.strategy;

import java.math.BigDecimal;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.strategy
 * @Date：2023/6/24 23:54
 * @Filename：Calculator
 * @description:
 */
// 客户端可以持有一个算法
public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public BigDecimal calculate(BigDecimal num1,BigDecimal num2){
        return operation.execute(num1,num2);
    }
}
