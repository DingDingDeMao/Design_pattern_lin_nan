package com.lin.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.strategy
 * @Date：2023/6/24 23:49
 * @Filename：OperationFactory
 * @description:
 */
public class OperationFactory {
    public static Map<String,Operation> operationMap = new HashMap<>(8);
    static {
        operationMap.put("+",new Multiplication());
        operationMap.put("-",new Subtraction());
        operationMap.put("*",new Multiplication());
        operationMap.put("/",new Division());
    }
    public static Operation getOperation(String type){
        return operationMap.get(type);
    }

}
