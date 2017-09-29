package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input =scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String type = input[1].toLowerCase();

        int[][] matrix = MatrixGenerator(size, type);
        print(matrix);

    }

    private static int[][] MatrixGenerator (int size, String type){
        int[][] matrix = new int[size][size];
        int count = 1;
        switch (type){
            case "a":
                for (int i = 0; i < matrix.length; i++) {


                        for (int j = 0; j < matrix.length; j++) {
                            matrix[j][i] = count;
                            count++;
                        }


                }
                break;
            case "b":

                for (int i = 0; i < matrix.length; i++) {

                    if(i%2==0) {
                        for (int j = 0; j < matrix.length; j++) {
                            matrix[j][i] = count;
                            count++;
                        }
                    }
                    else {
                        for (int j = matrix.length - 1; j >= 0; j--) {
                            matrix[j][i] =count;
                            count++;
                        }
                    }
                }
                break;
        }
        return matrix;
    }
    private static void print(int[][] matrix){

        for (int[] row: matrix) {
            for (int num:row) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
