package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class GetFirstOddOrEvenElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers  = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        scanner.next();
        int count = scanner.nextInt();
        String selected = "";
        String type = scanner.next();
        boolean even = type.equals("even");
        int currCount = 0;
        for(int i =0; i< numbers.length;i++){
            if(even){
              if(numbers[i]%2==0){
                  selected+=numbers[i]+" ";
                  currCount++;
              }
            }
            else{
                if(numbers[i]%2!=0){
                    selected+=numbers[i]+" ";
                    currCount++;
                }
            }
            if(currCount==count)
                break;
        }
        System.out.println(selected);
    }
}
