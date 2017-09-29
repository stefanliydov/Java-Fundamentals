package com.company;

import java.util.Scanner;

public class MatrixOfPalindroms {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            String[] strings = matrix[i];
            for (int j = 0; j < strings.length; j++) {

                String currentPol = ((char)(97+i)+""+(char)(97+i+j)+(char)(97+i));
                System.out.print(currentPol+" ");

            }
            System.out.println();
        }

    }
}
