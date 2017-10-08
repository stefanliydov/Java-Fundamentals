package com.company;

import java.util.*;

public class BasicStackOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] commands = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int push = commands[0];
        int pop = commands[1];
        int contains = commands[2];
        Deque<Integer> stack = new ArrayDeque<>();
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int num: arr){
            stack.push(num);
        }
        for (int i = 0; i <pop ; i++) {
            stack.pop();
        }
        if(stack.contains(contains)){
            System.out.println(true);
        }
        else{

            if(stack.size()==0){
                System.out.println(0);
            }
            else {
                int smallest = Integer.MAX_VALUE;
                for (int i = 0; i < stack.size(); i++) {
                    if (stack.peek() < smallest) {
                        smallest = stack.peek();
                    }
                    stack.pop();
                }
                System.out.println(smallest);
            }
        }
    }
}
