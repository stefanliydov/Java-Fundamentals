package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ByteParty {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[count];
        for (int i = 0; i <count ; i++) {
            int currNum = Integer.parseInt(scanner.nextLine());
            arr[i] =currNum;
        }
       while(true){

            String[] command = scanner.nextLine().split("\\s+");

            if(command[0].equals("party")){
                for (int num:arr) {
                    System.out.println(num);
                }
                break;
            }
            int action =Integer.parseInt(command[0]);
            int position= Integer.parseInt(command[1]);

            switch (action){
                case -1:
                    for (int i = 0; i <arr.length ; i++) {
                        arr[i]= (arr[i] ^ (1 << position));
                    }
                    break;
                case 0:
                    int mask = ~(1<<position);
                    for (int i = 0; i <arr.length ; i++) {
                        arr[i] = arr[i] & mask;
                    }
                    break;
                case 1:
                    int mask1 =1<<position;
                    for (int i = 0; i <arr.length ; i++) {
                        arr[i] = arr[i] | mask1;
                    }
                    break;
            }
       }
    }
}
