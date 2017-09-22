package com.company;

import java.util.Scanner;

public class XBits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = new String[8];
        for (int i = 0; i <8 ; i++) {

            String binary = String.format("%32s",Integer.toBinaryString(Integer.parseInt(scanner.nextLine())))
                    .replace(" ","0");
            numbers[i] = binary;
        }
        int count = 0;
        for (int i = 0; i <numbers.length -2; i++) {

            for (int j = 0; j < numbers[i].length() -2; j++) {
                String a = numbers[i].charAt(j) + ""+ numbers[i].charAt(j+1) + numbers[i].charAt(j+2);
                String b = numbers[i+1].charAt(j)+ "" + numbers[i+1].charAt(j+1) + numbers[i+1].charAt(j+2);
                String c = numbers[i+2].charAt(j)+ "" + numbers[i+2].charAt(j+1) + numbers[i+2].charAt(j+2);
                if(a.equals("101")&& b.equals("010") && c.equals("101")){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
