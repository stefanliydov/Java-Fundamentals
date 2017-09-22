package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            int[] ints = matrix[i];
            int[] currNums = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < ints.length; j++) {
                ints[j] = currNums[j];
            }
        }
        int sum = -100;
        String firstRow = "";
        String secRow = "";
        for (int i = 0; i < matrix.length -1; i++) {
            int[] ints = matrix[i];

            for (int j = 0; j < ints.length -1; j++) {

                int firstNum = matrix[i][j];
                int secNum = matrix[i][j+1];
                int thirdNum = matrix[i+1][j];
                int fourthNum = matrix[i+1][j+1];

                int currSum = firstNum+secNum+thirdNum+fourthNum;
                if(currSum >sum){
                    sum = currSum;
                    firstRow = firstNum + " " + secNum;
                    secRow = thirdNum + " " + fourthNum;
                }

            }
        }
        System.out.println(firstRow);
        System.out.println(secRow);
        System.out.println(sum);
    }
}
