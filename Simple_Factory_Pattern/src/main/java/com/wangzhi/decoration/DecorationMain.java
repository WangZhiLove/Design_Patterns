package com.wangzhi.decoration;

public class DecorationMain {

    public static void main(String[] args) {

        // 使用示例
        Person person = new Person("王智");
        // 穿衣
        Sneakers sneakers = new Sneakers(person);
        BigTrouser bigTrouser = new BigTrouser(sneakers);
        TShirts tShirts = new TShirts(bigTrouser);
        tShirts.show();

        // 接下来，如果需要扩展，继续写类继承Finery，然后来组装给人穿衣

    }
}
