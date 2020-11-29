package com.wangzhi.decoration;

public class Sneakers extends Finery {

    public Sneakers(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.println("破球鞋");
        super.show();
    }
}
