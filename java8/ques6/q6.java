package com.JavaNew;

interface Six {
    static void printstatic() {
        System.out.println("this is static method");
    }

    default void printdefault() {
        System.out.println("this is default method");
    }
}

public class q6 implements Six {
    public static void main(String[] args) {
        Six.printstatic();
        new q6().printdefault();
    }
}