package com.company;

import java.util.Scanner;

public class OddAndEvenPairs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] arr = new int[numbers.length];

        if( numbers.length %2!=0){
            System.out.println("invalid length");
        } else{

            for(int i =0; i<numbers.length;i++){
                arr[i]=Integer.parseInt(numbers[i]);
            }

            for (int i=0; i<numbers.length;i+=2){
                if(arr[i]%2==0 && arr[i+1]%2==0){
                    System.out.printf("%s, %s -> both are even",arr[i], arr[i+1]);
                    System.out.println();
                }
                else if(arr[i]%2!=0 && arr[i+1]%2!=0){
                    System.out.printf("%s, %s -> both are odd",arr[i], arr[i+1]);
                    System.out.println();
                } else{
                    System.out.printf("%s, %s -> different",arr[i], arr[i+1]);
                    System.out.println();
                }
            }
        }


    }
}
