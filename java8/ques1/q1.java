package com.JavaNew;

interface A {
    public boolean greater(int x, int y);
}

interface B {
    public int increment(int a);
}

interface C {
    public String concat(String a, String b);
}

interface D {
    public String uppercase(String c);
}

public class q1 {
    public static void main(String[] args) {
//     part1
        A one = (x, y) -> x > y ? true : false;
        System.out.println(one.greater(5, 3));
//     part2
        B two = a -> a = a + 1;
        System.out.println(two.increment(5));
//        part3
        C three = (a, b) -> a.concat(b);
        System.out.println(three.concat("mani", "dhar"));
//        part4
        D four = c -> c.toUpperCase();
        System.out.println(four.uppercase("manidhar"));
    }
}
