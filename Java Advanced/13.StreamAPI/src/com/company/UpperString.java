package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class UpperString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(x-> x.toUpperCase())
                .forEach(x-> System.out.print(x+" "));
    }
}
