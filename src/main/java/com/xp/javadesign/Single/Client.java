package com.xp.javadesign.Single;

public class Client {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            DoubleLockCheckSingle single = DoubleLockCheckSingle.getSingle();
            System.out.println(single);
        });
        Thread thread2 = new Thread(() -> {
            DoubleLockCheckSingle single = DoubleLockCheckSingle.getSingle();
            System.out.println(single);
        });
        Thread thread3 = new Thread(() -> {
            DoubleLockCheckSingle single = DoubleLockCheckSingle.getSingle();
            System.out.println(single);
        });
        thread1.start();
        thread2.start();
        thread3.start();



    }
}
