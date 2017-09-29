package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Sum(arr, 0));
    }
    private static int Sum(int[] arr,int index){
        if(index ==arr.length){
            return 0;
        }
        return arr[index]+ Sum(arr, index+1);
    }
}
