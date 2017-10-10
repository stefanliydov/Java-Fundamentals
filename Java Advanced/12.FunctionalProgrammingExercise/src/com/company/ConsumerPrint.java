package com.company;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        Consumer<String> print = x-> System.out.println(x);
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            print.accept(s);
        }
    }
}
