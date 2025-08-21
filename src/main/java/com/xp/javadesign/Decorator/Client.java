package com.xp.javadesign.Decorator;

public class Client {
    public static void main(String[] args) {
        // 1. 创建基础通知
        Notifier notifier = new BasicNotifier();

        // 2. 动态添加装饰功能
        notifier = new SMSDecorator(notifier);  // 叠加短信通知
        notifier = new WeChatDecorator(notifier); // 再叠加微信通知
        notifier = new QQDecorator(notifier);    // 最后叠加QQ通知

        // 3. 发送通知（会触发所有装饰链的调用）
        notifier.send("系统升级维护通知");
    }
}
