package com.company;

import java.util.Scanner;

public class SequenceInMatrix {

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
        String seq = "";
        for (int i = 0; i < matrix.length; i++) {
            String[] ints = matrix[i];
            for (int j = 0; j < ints.length-1; j++) {
                int currCount = 0;
                String tempSeq = "";
                if(matrix[i][j].equals(matrix[i][j+1])) {
                    currCount+=1;
                    tempSeq = matrix[i][j];
                }
                else{
                    if(currCount>=count){
                    count = currCount;
                    seq=tempSeq;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length-1; i++) {
            String[] strings = matrix[i];
            for (int j = 0; j < strings.length-1; j++) {
                int currCount = 0;
                String tempSeq = "";
                if(matrix[j][j].equals(matrix[j+1][j+1])) {
                    currCount+=1;
                    tempSeq = matrix[i][j];
                }
                else{
                    if(currCount>=count){
                        count = currCount;
                        seq=tempSeq;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length -1; i++) {
            String[] ints = matrix[i];
            for (int j = 0; j < ints.length-1; j++) {
                int currCount = 0;
                String tempSeq = "";
                if(matrix[j][i].equals(matrix[j+1][i])) {
                    currCount+=1;
                    tempSeq = matrix[i][j];
                }
                else{
                    if(currCount>=count){
                        count = currCount;
                        seq=tempSeq;
                    }
                }
            }
        }
        System.out.println(count);
        System.out.println(seq);
    }
}
