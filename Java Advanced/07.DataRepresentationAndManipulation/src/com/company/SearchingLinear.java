package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingLinear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int selected = Integer.parseInt(scanner.nextLine());
        int found = Arrays.binarySearch(arr, selected);
        if(found>=0) {
            System.out.println(found);
        }
else {
            System.out.println("-1");
        }
    }
}
