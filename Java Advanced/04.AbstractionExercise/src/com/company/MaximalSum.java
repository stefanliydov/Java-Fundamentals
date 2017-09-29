package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            int[] ints = matrix[i];
            int[] currNums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < ints.length; j++) {
                matrix[i][j]= currNums[j];
            }
        }
        int sum = -300;
        String first ="";
        String second ="";
        String third ="";
        for (int i = 0; i < matrix.length -2; i++) {
            int[] ints = matrix[i];
            for (int j = 0; j < ints.length -2; j++) {
                int num1 = matrix[i][j];
                int num2 = matrix[i][j+1];
                int num3 = matrix[i][j+2];
                int num4 = matrix[i+1][j];
                int num5 = matrix[i+1][j+1];
                int num6 = matrix[i+1][j+2];
                int num7 = matrix[i+2][j];
                int num8 = matrix[i+2][j+1];
                int num9 = matrix[i+2][j+2];
                int currSum = num1+num2+num3+num4+num5+num6+num7+num8+num9;
                if(currSum>sum){
                    sum =currSum;
                    first = num1+" "+num2+" "+num3;
                    second = num4+" "+num5+" "+num6;
                    third = num7+" "+num8+" "+num9;
                }
            }
        }
        System.out.println("Sum = "+sum);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
