package com.wangzhi.strategy;

/**
 * 打折类
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1.0d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    double acceptCash(double money) {
        return money * moneyRebate;
    }
}
