package com.company;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        reverse(arr,0);
        System.out.println(String.join(" ",arr));
    }
    private static void reverse(String[] arr, int index){

        if(index <arr.length/2){
            String temp = arr[index];
            arr[index]= arr[arr.length-index-1];
            arr[arr.length-index-1]=temp;
            reverse(arr, ++index);
        }
    }
}