package com.company;


import java.util.Collections;
import java.util.Scanner;

public class TextFilter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] filter = scanner.nextLine().split(", ");
        String text  =scanner.nextLine();
        for (String currFilter: filter) {
            text = text.replace(currFilter, String.join("",Collections.nCopies(currFilter.length(),"*")));
        }
        System.out.println(text);
    }
}
