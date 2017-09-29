package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            int[] ints = matrix[i];
            int[] currNums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < ints.length; j++) {
                matrix[i][j]= currNums[j];
            }
        }
        int sum1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum1+=matrix[i][i];
        }

        for (int i = 0; i < matrix.length; i++) {

            sum1-=matrix[i][matrix.length-i-1];
        }
        System.out.println(Math.abs(sum1));
    }
}
