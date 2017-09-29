package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Palindromes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("[!?\\s@#$%^&*().,/\"\':{}]");

        Set<String> palindromes = new TreeSet<>();

        for (String word:text){
            String rev = new StringBuffer(word).reverse().toString();
            if(word.equals(rev) && !word.equals("")){
                palindromes.add(word);
            }
        }
        System.out.println("["+String.join(", ",palindromes)+"]");
    }
}
