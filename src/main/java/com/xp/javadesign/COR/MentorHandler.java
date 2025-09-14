package com.xp.javadesign.COR;

public class MentorHandler implements Handler{

    private Handler nextHandler;
    @Override
    public void execute(LeaveRequestFormDTO data) {
        System.out.println("Mentor觉得可以，通过你的申请");
        if(this.nextHandler!=null){
            this.nextHandler.execute(data);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
