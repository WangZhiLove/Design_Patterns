package com.wangzhi.factory;

public class AddOperation extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
