package com.xp.javadesign.Decorator;

public class WeChatDecorator extends BaseDecorator {
    public WeChatDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("[微信通知] " + message);
    }
}
