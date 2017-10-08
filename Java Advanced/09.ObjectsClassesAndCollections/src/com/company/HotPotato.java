package com.company;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class HotPotato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> queue = new ArrayDeque<>();
        String[] kids = scanner.nextLine().split(" ");
        Collections.addAll(queue,kids);

        int n = Integer.parseInt(scanner.nextLine());

        while(queue.size()>1){

            for (int i = 1; i <n ; i++) {
                queue.offer(queue.poll());
            }
            System.out.println("Removed "+queue.poll());
        }
        System.out.println("Last is "+queue.poll());
    }
}
