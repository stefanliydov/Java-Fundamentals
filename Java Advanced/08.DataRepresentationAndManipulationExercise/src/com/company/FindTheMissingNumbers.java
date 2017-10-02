package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FindTheMissingNumbers {
        private static int sum;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }

        findTheMissingNumber(arr,0);
        System.out.println(sum);
    }
    private static void findTheMissingNumber(int[] arr, int n){
        if(n ==arr.length){
            return;
        }
        sum -= arr[n];
        findTheMissingNumber(arr, n+1);
    }
}
