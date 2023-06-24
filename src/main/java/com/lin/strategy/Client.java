package com.lin.strategy;

import java.math.BigDecimal;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.strategy
 * @Date：2023/6/24 23:57
 * @Filename：Client
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //计算加法
//        Addition addition = new Addition();
//        calculator.setOperation(addition);
//        BigDecimal result = calculator.calculate(new BigDecimal(56.12), new BigDecimal(45.13));
//        System.out.println(result);
        Division addition = new Division();
        calculator.setOperation(addition);
        BigDecimal result = calculator.calculate(new BigDecimal(56.12), new BigDecimal(45.13));
        System.out.println(result);
    }
}
