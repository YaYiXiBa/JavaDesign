package com.xp.javadesign.Single;

public class DoubleLockCheckSingle {
    private static volatile DoubleLockCheckSingle single;
    private DoubleLockCheckSingle(){

    }
    public static DoubleLockCheckSingle getSingle(){
        if(single == null){
            synchronized (DoubleLockCheckSingle.class){
                if (single == null){
                    single = new DoubleLockCheckSingle();
                }
            }
        }
        return single;
    }
}
