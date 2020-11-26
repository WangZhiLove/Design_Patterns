package com.wangzhi.strategy;

public class CashContext {

    private CashSuper cashSuper;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满100减50":
                cashSuper = new CashReturn(100, 50);
                break;
            case "打八折":
                cashSuper = new CashRebate(0.8);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
