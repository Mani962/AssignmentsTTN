package com.JavaNew;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class q12 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> optionalInteger = list.stream()
                .filter(e -> e % 2 == 0)
                .filter(e -> e > 3)
                .findFirst();


        System.out.println(optionalInteger.get());
    }
}