package com.JavaNew;

interface Seven {
    default void printdefault() {
        System.out.println("this is default method");
    }
}

class q7 implements Seven {
    public void printdefault() {
        System.out.println("DefaultMethod is overriden here");
    }

    public static void main(String[] args) {
        q7 q7 = new q7();
        q7.printdefault();
    }
}