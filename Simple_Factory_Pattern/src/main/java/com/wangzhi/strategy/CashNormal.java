package com.wangzhi.strategy;

public class CashNormal extends CashSuper{

    @Override
    double acceptCash(double money) {
        return money;
    }
}
