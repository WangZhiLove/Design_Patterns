package com.wangzhi.decoration;

public class BigTrouser extends Finery {

    public BigTrouser(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}
