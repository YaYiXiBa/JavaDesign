package com.xp.javadesign.Single;

public class InnerClassSingle {
    private InnerClassSingle(){

    }
    private static class InnerClass{
        private static final InnerClassSingle INSTANCE = new InnerClassSingle();
    }
    public InnerClassSingle getSingle(){
        return InnerClass.INSTANCE;
    }

}
