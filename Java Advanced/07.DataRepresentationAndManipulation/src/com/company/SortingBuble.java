package com.company;

import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
public class SortingBuble {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean swapped =true;
        do{
            swapped=false;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i]>arr[i+1]){
                    swapped = true;
                    swap(arr,i, i+1);
                }
            }
        }while(swapped);
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
