package com.company;

import java.util.Scanner;

public class SubBigNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String num1 = new StringBuffer(scanner.nextLine()).reverse().toString();
        String num2 = new StringBuffer(scanner.nextLine()).reverse().toString();

        int max = Math.max(num1.length(),num2.length());
        int min = Math.min(num1.length(),num2.length());
        
        StringBuilder sum = new StringBuilder();

        for (int i = 0; i <min ; i++) {
            
        }
    }
}
