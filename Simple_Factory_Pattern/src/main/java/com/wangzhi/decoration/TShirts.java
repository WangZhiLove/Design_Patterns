package com.wangzhi.decoration;

/**
 * 具体的服装类
 */
public class TShirts extends Finery{

    public TShirts(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
