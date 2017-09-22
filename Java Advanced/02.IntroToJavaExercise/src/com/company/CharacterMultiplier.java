package com.company;

import java.util.Scanner;

public class CharacterMultiplier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String first = scanner.next();
        String second = scanner.next();

        long sum = 0;
       int max = Math.max(first.length(),second.length());
       for(int i =0; i<max;i++){
           int num1= 1;
           int num2= 1;
           if(i < first.length()){
               num1 = (int)first.charAt(i);
           }
           if(i < second.length()){
               num2 = (int)second.charAt(i);
           }

         sum+= num1*num2;
       }
       System.out.println(sum);

    }
}
