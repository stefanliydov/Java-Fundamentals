package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BlurFilter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int blurFilter = Integer.parseInt(scanner.nextLine());
        int [] rowAndCol = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[rowAndCol[0]][];

        for (int i = 0; i < rowAndCol[0].length; i++) {
            int[] ints =  Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] =ints;
            
        }
        int [] position = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int row = position[0];
        int col = position[1];

        if(row>=&&row<matrix.length;)
    }
}
