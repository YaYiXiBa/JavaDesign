package com.xp.javadesign.composite;

public class Client {
    public static void main(String[] args) {
        Composite composite = new Composite();
        LeafClass leaf1 = new LeafClass("鞋子", 500);
        LeafClass leaf2 = new LeafClass("衣服", 500);
        LeafClass leaf3 = new LeafClass("裤子", 500);
        composite.add(leaf1);
        composite.add(leaf2);
        composite.add(leaf3);

        Composite other = new Composite();
        LeafClass leaf4 = new LeafClass("手表", 1000);
        LeafClass leaf5 = new LeafClass("钥匙", 100000);
        other.add(leaf4);
        other.add(leaf5);

        composite.add(other);

        Integer sum = composite.execute();
        System.out.println("总价格:" + sum);
    }
}
