package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TakeTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .filter(x -> x>=10 && x<=20)
                .distinct()
                .limit(2)
                .forEach(x -> System.out.print(x+" "));
    }
}
