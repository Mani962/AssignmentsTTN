package com.JavaNew;

interface Eight {
    default void display() {
        System.out.println("this is Eight interface");
    }
}

interface Eightone {
    default void display() {
        System.out.println("this is Eightone interface");
    }
}

class q8 implements Eight, Eightone {
    public void display() {
        System.out.println("this is class q8");
    }

    public static void main(String[] args) {
        new q8().display();
    }
}