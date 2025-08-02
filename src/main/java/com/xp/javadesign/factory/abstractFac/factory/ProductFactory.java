package com.xp.javadesign.factory.abstractFac.factory;

import com.xp.javadesign.factory.abstractFac.Color.Color;
import com.xp.javadesign.factory.abstractFac.Product.PC;
import com.xp.javadesign.factory.abstractFac.Product.Phone;
import com.xp.javadesign.factory.abstractFac.Product.Product;
import com.xp.javadesign.factory.abstractFac.Product.Watch;

public class ProductFactory extends Factory{
    @Override
    public Product getProduct(String productName) {
        if(productName.equals("PC")){
            return new PC();
        }else if(productName.equals("Phone")){
            return new Phone();
        }else if(productName.equals("Watch")){
            return new Watch();
        }
        return null;
    }

    @Override
    public Color getColor(String colorName) {
        return null;
    }
}
