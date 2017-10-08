package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(", ");

        Function<String,Integer> add = x-> Integer.parseInt(x);
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            sum+= add.apply(s);
        }
        System.out.println("Count = "+arr.length);
        System.out.println("Sum = "+sum);
    }
}
