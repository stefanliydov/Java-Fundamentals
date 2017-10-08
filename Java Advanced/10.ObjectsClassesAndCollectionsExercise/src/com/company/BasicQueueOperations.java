package com.company;

import java.util.*;

public class BasicQueueOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] commands = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int add = commands[0];
        int poll = commands[1];
        int contains = commands[2];
        Queue<Integer> stack = new ArrayDeque<>();
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int num: arr){
            stack.add(num);
        }
        for (int i = 0; i <poll ; i++) {
            stack.remove();
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
                    int currNum = stack.remove();
                    if(currNum<smallest){
                        smallest=currNum;
                    }
                }
                System.out.println(smallest);
            }
        }
    }
}
