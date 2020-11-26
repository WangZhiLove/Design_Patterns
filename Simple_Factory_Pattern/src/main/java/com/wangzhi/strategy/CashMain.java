package com.wangzhi.strategy;

import java.util.Scanner;

public class CashMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品的单价：");
        String price = scanner.nextLine();
        System.out.println("请输入商品的个数");
        String number = scanner.nextLine();
        System.out.println("请输入促销活动（正常收费、满100减50、打八折中的任意一个）：");
        String cash = scanner.nextLine();
        CashContext cashContext = new CashContext(cash);
        double result = cashContext.getResult(Double.parseDouble(price) * Double.parseDouble(number));
        System.out.println(result);
    }
}
