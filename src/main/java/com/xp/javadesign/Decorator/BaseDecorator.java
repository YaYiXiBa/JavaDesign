package com.xp.javadesign.Decorator;

// 抽象装饰器（Decorator）
public abstract class BaseDecorator implements Notifier {
    private final Notifier wrappee;  // 持有被装饰对象

    protected BaseDecorator(Notifier notifier) {
        this.wrappee = notifier;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);  // 委托给被装饰对象
    }
}
