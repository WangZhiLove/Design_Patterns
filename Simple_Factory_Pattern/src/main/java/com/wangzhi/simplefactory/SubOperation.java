package com.wangzhi.simplefactory;

public class SubOperation extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
