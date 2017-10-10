package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvenOrOdds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String type = scanner.nextLine();

        Predicate<Integer> evenOrOdd = returnType(type);
        for (int i = arr[0]; i <= arr[1]; i++) {
            if(evenOrOdd.test(i)) {
                System.out.print(i + " ");
            }
        }
    }
    private static Predicate<Integer> returnType(String type){
        switch (type){
            case "even":
                return x->x%2==0;
            case "odd":
                    return x->x%2!=0;
                    default:
                        return null;
                }
        }

}
