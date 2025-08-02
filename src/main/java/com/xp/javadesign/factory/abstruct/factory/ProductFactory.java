package com.xp.javadesign.factory.abstruct.factory;

import com.xp.javadesign.factory.abstruct.Color.Color;
import com.xp.javadesign.factory.abstruct.Product.PC;
import com.xp.javadesign.factory.abstruct.Product.Phone;
import com.xp.javadesign.factory.abstruct.Product.Product;
import com.xp.javadesign.factory.abstruct.Product.Watch;

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
