package com.xp.javadesign.Decorator;

public class SMSDecorator extends BaseDecorator {
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);  // 先调用父类（被装饰对象）的方法
        sendSMS(message);     // 新增SMS发送功能
    }

    private void sendSMS(String message) {
        System.out.println("[短信通知] " + message);
    }
}
