package com.company;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;

public class AverageDoubles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       OptionalDouble average = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(d -> !d.isEmpty())
                .mapToDouble(Double::parseDouble)
                .average();
       if(average.isPresent()){
           System.out.printf("%.2f",average.getAsDouble());
       }
       else{
           System.out.println("No match");
       }
    }
}
