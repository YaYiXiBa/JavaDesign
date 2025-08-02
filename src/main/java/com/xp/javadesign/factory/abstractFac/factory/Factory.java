package com.xp.javadesign.factory.abstractFac.factory;

import com.xp.javadesign.factory.abstractFac.Color.Color;
import com.xp.javadesign.factory.abstractFac.Product.Product;

public abstract class  Factory {
    public abstract Product getProduct(String productName);
    public abstract Color getColor(String colorName);
}
