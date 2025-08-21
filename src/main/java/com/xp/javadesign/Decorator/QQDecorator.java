package com.xp.javadesign.Decorator;

public class QQDecorator extends BaseDecorator {
    public QQDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("[QQ通知] " + message);
    }
}
