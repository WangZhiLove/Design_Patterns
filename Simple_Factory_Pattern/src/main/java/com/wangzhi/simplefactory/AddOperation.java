package com.wangzhi.simplefactory;

public class AddOperation extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
