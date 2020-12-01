package com.wangzhi.simplefactory;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public abstract class Operation {

    private double numberA;

    private double numberB;

    /**
     * 实现两数的运算
     * @return  返回两数运算的结果
     */
    public abstract double getResult();

}
