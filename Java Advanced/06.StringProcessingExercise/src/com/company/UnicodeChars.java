package com.company;

import java.util.Scanner;

public class UnicodeChars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char ch:
             input) {
            sb.append(String.format("\\u%04x", (int) ch));
        }
        System.out.println(sb.toString());
    }
}
