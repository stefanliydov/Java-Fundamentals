package com.company;

import java.util.Scanner;

public class BalancedParentheses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.nextLine().toCharArray();

        System.out.println(isBalanced(arr));
    }
    private static String isBalanced(char[] arr){
        if(arr.length%2!=0){
            return "NO";
        }
        for (int i = 0; i < arr.length/2; i++) {
            switch (arr[i]){
                case '{':
                    if(arr[arr.length-1-i] !='}'){
                        return "NO";
                    }
                    break;
                case '[':
                    if(arr[arr.length-1-i] !=']'){
                        return "NO";
                    }
                    break;
                case '(':
                    if(arr[arr.length-1-i] !=')'){
                        return "NO";
                    }
                    break;
                    default:
                        return "NO";

            }
        }
        return "YES";
    }
}
