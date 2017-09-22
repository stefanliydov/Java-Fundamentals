package com.company;

import java.util.Scanner;

public class HitTheTarget {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();


        for(int i = 1;i<=20;i++){
            for(int r =1; r<=20;r++){
                if(i+r==num){
                    System.out.printf("%s + %s = %s",i,r,num);
                    System.out.println();
                }
                if(i-r==num){
                    System.out.printf("%s - %s = %s",i,r,num);
                    System.out.println();
                }
            }
        }
    }
}
