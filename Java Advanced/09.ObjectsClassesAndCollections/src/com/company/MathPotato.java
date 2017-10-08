package com.company;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class MathPotato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> queue = new ArrayDeque<>();
        String[] kids = scanner.nextLine().split(" ");
        Collections.addAll(queue,kids);

        int n = Integer.parseInt(scanner.nextLine());
        int cycle = 1;
        while(queue.size()>1){

            for (int i = 1; i <n ; i++) {
                queue.offer(queue.poll());
            }
            if(isPrime(cycle)){
                System.out.println("Prime "+queue.peek());
            }
            else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }
        System.out.println("Last is "+queue.poll());
    }
    private static boolean isPrime(int n){

        if(n <=1){
            return false;
        }
        for(int divisor=2;
                divisor<=Math.sqrt(n);divisor++){
            if(n%divisor==0){
                return false;
            }
        }
        return true;
    }
}
