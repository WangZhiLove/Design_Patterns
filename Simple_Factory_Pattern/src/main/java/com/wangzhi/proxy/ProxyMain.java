package com.wangzhi.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl("芊芊");
        Pursuit pursuit = new Pursuit(schoolGirl);
        Proxy proxy = new Proxy(pursuit);

        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();
    }
}
