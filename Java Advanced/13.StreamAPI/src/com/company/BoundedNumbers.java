package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BoundedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] bounds = Arrays.stream(scanner.nextLine().split("\\s+")).sorted().mapToInt(Integer::parseInt).toArray();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .filter(x -> x>=bounds[0] && x<=bounds[1])
                .forEach(x -> System.out.print(x+" "));
    }
}
