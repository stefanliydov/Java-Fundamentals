package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class OverLappingIntervals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i] = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        }
        boolean found = false;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i][1]>=arr[j][0] && arr[i][0]<=arr[j][0]){
                    found = true;
                }
            }
        }
        System.out.println(found);
    }
}
