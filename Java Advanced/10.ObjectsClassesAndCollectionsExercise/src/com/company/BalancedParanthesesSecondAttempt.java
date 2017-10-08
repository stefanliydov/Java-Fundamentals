package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParanthesesSecondAttempt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.nextLine().toCharArray();
        System.out.println(isBalanced(arr));

    }
    private static String isBalanced(char[] arr){

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {

            switch (arr[i]){
                case '(':
                    stack.push(arr[i]);
                    break;
                case '[':
                    stack.push(arr[i]);
                    break;
                case '{':
                    stack.push(arr[i]);
                    break;

                case')':
                    if(stack.peek()==null || stack.peek()!='('){
                        return "NO";
                    }
                    stack.pop();
                    break;
                case']':
                    if(stack.peek()==null || stack.peek()!='['){
                        return "NO";
                    }
                    stack.pop();
                    break;
                case'}':
                    if(stack.peek()==null || stack.peek()!='{'){
                        return "NO";
                    }
                    stack.pop();
                    break;
            }
        }
        return "YES";
    }
}
