package com.xp.javadesign.COR;

public class LeaderHandler implements Handler{
    private Handler nextHandler;
    @Override
    public void execute(LeaveRequestFormDTO data) {
        if(data.getDays() > 20){
            throw new RuntimeException("时间也太久了，不通过");
        }
        System.out.println("Leader觉得可以，通过你的申请");
        if(this.nextHandler!=null){
            this.nextHandler.execute(data);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
