package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;
public class ExtractSentce {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern  = Pattern.compile("[\\A!.?] ?(.*?is.*?[\\b!.?\\Z])");

    }
}
