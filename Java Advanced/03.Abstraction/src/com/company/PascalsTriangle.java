package com.company;

import java.util.Scanner;

public class PascalsTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[][] pascal =pascalTriangleGenerator(n);
        for(int[] row:pascal){
            for (int num:row){
                if(num!=0){
                    System.out.print(num+" ");
                }
            }
            System.out.println();
        }
    }
    private static int[][] pascalTriangleGenerator(int n){
        int[][] res = new int[n][n];

        for (int row = 0; row < n; row++) {
            res[row][0] = 1;
            res[row][row] =1;
            if(row >1) {
                for (int col = 1; col < n; col++) {
                  int[] prevRow = res[row-1];
                  int sum = prevRow[col-1] + prevRow[col];
                  res[row][col] = sum;
                }
            }
        }
        return res;
    }
}
