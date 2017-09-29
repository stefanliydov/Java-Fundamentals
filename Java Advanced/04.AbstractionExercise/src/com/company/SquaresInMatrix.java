package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresInMatrix {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            String[] ints = matrix[i];
           String[] currNums = scanner.nextLine().split("\\s+");
            for (int j = 0; j < ints.length; j++) {
                matrix[i][j]= currNums[j];
            }
        }
        int count = 0;
        for (int i = 0; i < matrix.length -1; i++) {
            String[] ints = matrix[i];
            for (int j = 0; j < ints.length -1; j++) {
                String first = matrix[i][j];
                String second = matrix[i][j+1];
                String third = matrix[i+1][j];
                String fourth = matrix[i+1][j+1];
                if(first.equals(second) && second.equals(third) && third.equals(fourth))
                    count++;
            }
        }
        System.out.println(count);
    }
}
