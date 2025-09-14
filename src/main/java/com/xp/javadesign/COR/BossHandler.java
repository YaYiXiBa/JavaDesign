package com.xp.javadesign.COR;

public class BossHandler implements Handler{
    private Handler nextHandler;

    @Override
    public void execute(LeaveRequestFormDTO data) {
        if(!data.getReason().contains("生病")){
            throw new RuntimeException("没生病请什么假？");
        }
        System.out.println("Boss觉得可以，通过你的申请");
        if(this.nextHandler!=null){
            this.nextHandler.execute(data);
        }

    }

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
