package com.xp.javadesign.factory.abstractFac.factory;

import com.xp.javadesign.factory.abstractFac.Color.Black;
import com.xp.javadesign.factory.abstractFac.Color.Color;
import com.xp.javadesign.factory.abstractFac.Color.Red;
import com.xp.javadesign.factory.abstractFac.Color.Yellow;
import com.xp.javadesign.factory.abstractFac.Product.Product;

import java.util.Objects;

public class ColorFactory extends Factory{
    @Override
    public Product getProduct(String productName) {

        return null;
    }

    @Override
    public Color getColor(String colorName) {
        if(Objects.equals(colorName, "red")){
            return new Red();
        }else if(colorName.equals("black")){
            return new Black();
        }else if (colorName.equals("yellow")){
            return new Yellow();
        }
        return null;
    }
}
