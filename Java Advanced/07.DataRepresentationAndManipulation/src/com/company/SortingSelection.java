package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortingSelection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length-1; i++) {
            int i1 = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    swap(arr, i, j);
                }

            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    private static void swap(int[]arr, int first, int sec){
        int temp = arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }
}
