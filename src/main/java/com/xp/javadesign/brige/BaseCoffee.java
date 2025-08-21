package com.xp.javadesign.brige;

public abstract class BaseCoffee{
    //关键步骤，将会引起某一维度变化的属性抽象为接口，子类中在引入抽象的具体实现
    protected CoffeeAdditive additive;

    public BaseCoffee(CoffeeAdditive additive){
        this.additive = additive;
    }
    public abstract void makeCoffee();
}
