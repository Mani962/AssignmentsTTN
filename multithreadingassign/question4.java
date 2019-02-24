/*
shutdown():
It will just tell the executor service that it can't accept new tasks, but the already submitted tasks continue to run.
shutdownNow():
It will do the same AND will try to cancel the already submitted tasks by interrupting the relevant threads.
*/
package com.multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class question4 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1.1");
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(5000);
                    }catch (InterruptedException e){
                        System.out.println("Thread 1.2 Interrupted!");
                    }
                    System.out.println("Thread 1.2");
                }
            });
        } finally {
            executorService.shutdown();
        }

        System.out.println("--------------------");

        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        try {
            executorService1.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2.1");
                }
            });

            executorService1.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(5000);
                    }catch (InterruptedException e){
                        System.out.println("Thread 2.2 Interrupted!");
                    }
                    System.out.println("Thread 2.2");
                }
            });
        } finally {
            executorService1.shutdownNow();
        }
    }
}