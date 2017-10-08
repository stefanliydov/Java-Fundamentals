package com.company;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class MaximumElements {
    private static int forPush;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int[] line = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            if(line.length ==2){
                forPush = line[1];
            }
            performAction(stack,line[0]);
        }
    }
    private static void performAction(Deque<Integer> stack, int n){

       switch (n){
           case 1:
               stack.offer(forPush);
               break;
           case 2:

                   stack.removeLast();

               break;
           case 3:
               if(stack.size()==0){
                   System.out.println(0);
               }
               else {
                   int biggest = Integer.MIN_VALUE;
                  for(int num:stack){
                      if(num>biggest){
                          biggest=num;
                      }
                  }
                   System.out.println(biggest);
               }
               break;
       }
    }
}
