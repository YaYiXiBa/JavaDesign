package com.xp.javadesign.factory.abstruct.factory;

import com.xp.javadesign.factory.abstruct.Color.Color;
import com.xp.javadesign.factory.abstruct.Product.Product;

public abstract class  Factory {
    public abstract Product getProduct(String productName);
    public abstract Color getColor(String colorName);
}
