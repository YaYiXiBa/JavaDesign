package com.xp.javadesign.prototype;

public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj;
        obj = super.clone();
        return obj;
    }
}
