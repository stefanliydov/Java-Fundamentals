package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MatchingBrackets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();

        String line = scanner.nextLine();

        for (int i = 0; i <line.length() ; i++) {
            char sym = line.charAt(i);
            if(sym == '('){
                stack.push(i);
            }
            else if(sym ==')'){
                System.out.println(line.substring(stack.pop(),i+1));
            }
        }
    }
}
