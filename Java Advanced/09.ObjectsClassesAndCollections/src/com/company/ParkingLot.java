package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> set = new HashSet<>();

        while(true){
            String[] temp = scanner.nextLine().split(", ");
            String dir = temp[0];

            if(dir.equalsIgnoreCase("end")){
                break;
            }
            String carNum = temp[1];
            if(dir.equalsIgnoreCase("in")){
                set.add(carNum);
            }
            else if(dir.equalsIgnoreCase("out")){
                set.remove(carNum);
            }
        }
        for(String num:set){
            System.out.println(num);
        }
        if(set.size() ==0){
            System.out.println("Parking Lot is Empty");
        }
    }
}
