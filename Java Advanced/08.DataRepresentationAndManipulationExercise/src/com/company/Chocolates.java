package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Chocolates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int packets = Integer.parseInt(scanner.nextLine());
        int[] boxes  = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int students = Integer.parseInt(scanner.nextLine());

        scanner.close();
        Arrays.sort(boxes);


        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= boxes.length-students; i++) {
            int currDiff = boxes[i+students-1]-boxes[i];
            if(currDiff<minDiff){
                minDiff =currDiff;
            }
        }
        System.out.printf("Min Difference is %s.",minDiff);
    }
}
