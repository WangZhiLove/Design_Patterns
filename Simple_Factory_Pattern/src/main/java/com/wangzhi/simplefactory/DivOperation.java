package com.wangzhi.simplefactory;

public class DivOperation extends Operation {
    @Override
    public double getResult() {
        if (getNumberB() == 0) {
            throw new RuntimeException("除数不能为0");
        }
        return getNumberA() / getNumberB();
    }
}
