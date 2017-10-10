package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

import static jdk.nashorn.internal.runtime.regexp.joni.constants.AsmConstants.S;

public class CustomMinFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Integer[] intArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Consumer<Integer[]> printSmaller = x->{
            int smallest = Integer.MAX_VALUE;
            for (int i = 0; i < x.length; i++) {
                Integer integer = x[i];
                if(integer<smallest){
                    smallest=integer;
                }
            }
            System.out.println(smallest);
        };
        printSmaller.accept(intArr);
    }
}
