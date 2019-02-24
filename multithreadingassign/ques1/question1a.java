package com.multithreading;

public class question1a implements Runnable {
    @Override
    public void run() {
        System.out.println("my runnable interface running");
    }

    public static void main(String[] args) {
        Thread t1 =new Thread(new question1a ());
        t1.start();

    }
}



