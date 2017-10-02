package com.company;

import java.util.Scanner;

public class CombinationsCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        System.out.println(factorial(n,k));
    }
    private static int factorial(int n,int k){
        if(k==0 ||k==n){
            return 1;
        }
        return factorial(n-1,k-1)+factorial(n-1,k);
    }
}
