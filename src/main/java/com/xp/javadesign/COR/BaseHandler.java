package com.xp.javadesign.COR;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseHandler {
    private List<Handler> handlers= new ArrayList<>();

    public List<Handler> getHandlers(){
        return this.handlers;
    }
    private void init(){
        if(handlers.isEmpty()){
            return;
        }
        for (int i=0; i<handlers.size(); i++){
            Handler handler = handlers.get(i);
            if(i+i <= handlers.size()){
                handler.setNextHandler(handlers.get(i+1));
            }
        }
    }
    public static Handler build(){
        BaseHandler baseHandler = new BaseHandler();
        List<Handler> list = baseHandler.getHandlers();

        MentorHandler mentorHandler = new MentorHandler();
        LeaderHandler leaderHandler = new LeaderHandler();
        BossHandler bossHandler = new BossHandler();

        list.add(mentorHandler);
        list.add(leaderHandler);
        list.add(bossHandler);
        baseHandler.init();
        return baseHandler.getHandlers().get(0);

    }
}
