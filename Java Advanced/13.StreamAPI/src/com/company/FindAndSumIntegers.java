package com.company;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;

public class FindAndSumIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Optional<Integer> sum = Arrays.stream(scanner.nextLine().split("\\s+"))
        .filter(x -> isNumber(x))
                .map(Integer::parseInt)
                .reduce((x,y) ->x+y);
        if(sum.isPresent()){
            System.out.println(sum.get());
        }else{
            System.out.println("No match");
        }
    }
    private static boolean isNumber(String s){
        return s.matches("-?\\d+[.,]?\\d*");
    }
}
