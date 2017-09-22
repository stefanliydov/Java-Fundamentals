package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        int[][] matrix = new int[rows][cols];
        System.out.println(rows);
        System.out.println(cols);
        for (int i = 0; i < matrix.length; i++) {
            int[] ints = matrix[i];
            int[] currNums = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < ints.length; j++) {
                ints[j] = currNums[j];
            }
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int[] ints = matrix[i];

            for (int j = 0; j < ints.length; j++) {
                int anInt = ints[j];
                sum+=anInt;
            }
        }
        System.out.println(sum);
    }
}
