package com.xp.javadesign.Single;

public class LazySingle {
    private static LazySingle single;
    private LazySingle (){
    }
    public static LazySingle getSingle(){
        if(single==null){
            single = new LazySingle();
        }
        return single;
    }
}
