package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class ListOfPredicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = Integer.parseInt(scanner.nextLine());
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        for (int i = 1; i <= range; i++) {
            boolean div = true;
            for (int j = 0; j < arr.length; j++) {
               int num = arr[j];
               Predicate<Integer> test = divisible(num);
               if(!test.test(i)){
                   div=false;
                   break;
               }
            }
            if(div){
                System.out.print(i+" ");
            }
        }
    }
    private static Predicate<Integer> divisible(int n){
        return x-> x%n==0;
    }
}
