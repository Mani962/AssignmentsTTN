package com.JavaNew;

interface M {
    int operation(int a, int b);
}

public class q2 {
    public static void main(String[] args) {
        M greater = (a, b) -> (a > b ? a : b);
        System.out.println(greater.operation(6, 4));

    }
}
