package com.xp.javadesign.Single;

public class HungrySingle {
    private static final HungrySingle single = new HungrySingle();
    private HungrySingle (){
    }
    public static HungrySingle getSingle(){
        return single;
    }
}
