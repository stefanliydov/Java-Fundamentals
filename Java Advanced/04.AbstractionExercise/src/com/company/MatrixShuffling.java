package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String[][] matrix = new String[size[0]][size[1]];

        for (int i = 0; i < matrix.length; i++) {
            String[] strings = matrix[i];
            String[] line = scanner.nextLine().split("\\s+");
            for (int j = 0; j < strings.length; j++) {
                matrix[i][j] = line[j];
            }
        }
        String command = "";
        while (!command.equals("END")) {

            String[] commandsArr =scanner.nextLine().split("\\s+");
            command = commandsArr[0];
            if(!command.equals("swap") || commandsArr.length<5){
                System.out.println("Invalid input!");
            }
            else{
                int row1 = Integer.parseInt(commandsArr[1]);
                int col1 = Integer.parseInt(commandsArr[2]);
                int row2 = Integer.parseInt(commandsArr[3]);
                int col2 = Integer.parseInt(commandsArr[4]);

                if((row1<0) || (row2<0) || (row1>=size[0]) || (row2>=size[0]) ||
                        (col1<0) || (col2<0) || (col1>=size[1]) || (col2>=size[1])){
                    System.out.println("Invalid input!");
                }
                else{
                    String temp = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = temp;
                    for (String[] row:
                         matrix) {

                        System.out.println(String.join(" ",row));

                    }
                }
            }
        }

    }
}
