package com.multithreading;

public class question1 extends Thread{
    public void run()
    {
        System.out.println("MY thread class running");
    }
    public static void main(String[] args) {
        question1 t1=new question1();
        t1.start();

    }

}
