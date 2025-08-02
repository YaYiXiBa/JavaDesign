package com.xp.javadesign.factory.abstractFac.factory;

public class FactoryProducer {
    public static Factory getFactory(String factoryName){
        if(factoryName.equals("ColorFactory")){
            return new ColorFactory();
        } else if (factoryName.equals("ProductFactory")) {
            return new ProductFactory();
        }else{
            throw new RuntimeException("名称有误");
        }
    }
}
