package com.xp.javadesign.COR;

public class Client {
    public static void main(String[] args) {
        LeaveRequestFormDTO dto = new LeaveRequestFormDTO();
        dto.setDays(20);
        dto.setReason("领导我生病了（实际还是请假的借口罢了）");
        try{
            Handler handler = BaseHandler.build();
            handler.execute(dto);
            System.out.println("恭喜你请假通过！！！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("很遗憾，你的请假审批流程被中断了。。。");
        }
    }
}
