package com.wangzhi.decoration;

/**
 * 服装类
 */
public class Finery extends Person {

    private Person person;

    public Finery(Person person) {
        super();
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
