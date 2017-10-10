package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class AppliedArithmetic {
    private static Integer[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while(true){

            String line = scanner.nextLine();

            if(line.equals("end")){
                break;
            }

            if(line.equals("print")){
                for (int i : arr) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            else{
                Function<Integer,Integer> doMath = actionRecognition(line);
                for (int i = 0; i < arr.length; i++) {
                    int i1 = arr[i];
                    arr[i] = doMath.apply(i1);
                }
            }
        }
    }

    private static Function<Integer,Integer> actionRecognition(String line) {
        switch (line){
            case "add":
                return x->x+1;
            case "multiply":
                return x->x*2;
            case "subtract":
                return x->x-1;
        default:
            return null;
        }
    }


}
