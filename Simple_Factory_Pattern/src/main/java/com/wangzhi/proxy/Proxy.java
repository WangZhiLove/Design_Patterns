package com.wangzhi.proxy;

/**
 * 代理的对象
 */
public class Proxy implements IGiveGift {

   /*private IGiveGift iGiveGift;

   public Proxy(IGiveGift iGiveGift) {
       this.iGiveGift = iGiveGift;
   }*/

    private Pursuit iGiveGift;

    public Proxy(Pursuit iGiveGift) {
        this.iGiveGift = iGiveGift;
    }

    @Override
    public void giveDolls() {
        iGiveGift.giveDolls();
    }

    @Override
    public void giveFlowers() {
        iGiveGift.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        iGiveGift.giveChocolate();
    }
}
