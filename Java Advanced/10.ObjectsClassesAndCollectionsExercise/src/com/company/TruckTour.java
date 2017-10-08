package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TruckTour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter =0;
        for (int i = 0; i <n ; i++) {
            int[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(line[0]>=line[1]){
                if(counter==3) {
                    System.out.println(i);
                    break;
                }
                counter++;
            }
        }
    }
}
