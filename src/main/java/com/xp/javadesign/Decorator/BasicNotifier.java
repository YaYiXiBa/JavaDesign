package com.xp.javadesign.Decorator;

// 基础通知实现（ConcreteComponent）
public class BasicNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[基础通知] " + message);
    }
}
