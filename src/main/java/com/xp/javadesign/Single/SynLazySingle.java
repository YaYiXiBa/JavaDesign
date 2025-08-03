package com.xp.javadesign.Single;

public class SynLazySingle {
    private static volatile SynLazySingle single;
    private SynLazySingle (){
    }
    public static synchronized SynLazySingle getSingle(){
        if(single==null){
            single = new SynLazySingle();
        }
        return single;
    }
}
