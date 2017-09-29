package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubStringOccur {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        String pat = scanner.nextLine().toLowerCase();

        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(text);
        int count =0;
        while(matcher.find()){
        count++;
        }
        System.out.println(count);
    }
}
