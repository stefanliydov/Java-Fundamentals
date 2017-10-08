package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUpperWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        ArrayList<String> upperCaseWords = new ArrayList<>();
        Predicate<String> isUpper = x-> x.charAt(0) == x.toUpperCase().charAt(0);
        for (int i = 0; i < text.length; i++) {
            String s = text[i];
            if(isUpper.test(s)){
                upperCaseWords.add(s);
            }
        }
        System.out.println(upperCaseWords.size());
        upperCaseWords.forEach(word -> System.out.println(word));
    }
}
