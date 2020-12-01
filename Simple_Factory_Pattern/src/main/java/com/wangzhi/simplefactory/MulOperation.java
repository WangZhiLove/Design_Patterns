package com.wangzhi.simplefactory;

public class MulOperation extends Operation {
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
