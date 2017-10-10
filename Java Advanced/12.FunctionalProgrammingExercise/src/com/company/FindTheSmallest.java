package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class FindTheSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[],Integer> findSmallest = x->{
            int smallest = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < x.length; i++) {
                if(x[i]<=smallest){
                    smallest = x[i];
                    index=i;
                }
            }
            return index;
        };
        System.out.println(findSmallest.apply(arr));
    }
}
