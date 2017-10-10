package com.company;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicatesForNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = scanner.nextLine().split(" ");

        Predicate<String> lenghtCheck = x-> x.length()<=n;
        for (String s : arr) {
            if(lenghtCheck.test(s)){
                System.out.println(s);
            }
        }
    }
}
