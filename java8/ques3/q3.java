package com.JavaNew;

interface Q {
    void operation(int a, int b);
}

public class q3 {
    static void mulMethod(int a, int b) {
        System.out.println(a * b);
    }

    void addMethod(int a, int b) {
        System.out.println(a + b);
    }

    void subMethod(int a, int b) {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        Q q1 = new q3()::addMethod;
        Q q2 = new q3()::subMethod;
        Q q4 = q3::mulMethod;
        q1.operation(8, 6);
        q2.operation(9, 6);
        q4.operation(5, 8);

    }
}
