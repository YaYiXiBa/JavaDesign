package com.xp.javadesign.COR;

public interface Handler {
    void execute(LeaveRequestFormDTO data);
    void setNextHandler(Handler handler);
}
