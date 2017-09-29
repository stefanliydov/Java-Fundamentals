package com.company;

import java.util.Scanner;

public class SeriesOfLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            String letter =  Character.toString(text.charAt(i));

            text = text.replaceAll(String.format("%s+",letter),letter);

        }
        System.out.println(text);
    }
}
