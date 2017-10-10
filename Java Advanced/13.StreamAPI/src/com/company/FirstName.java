package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s+");
        List<String> letters = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(x -> x.toLowerCase())
                .collect(Collectors.toList());
      Optional<String> opt =  Arrays.stream(arr)
                .filter(x -> letters.contains(String.valueOf(x.charAt(0)).toLowerCase()))
                .sorted()
                .findFirst();

      if(opt.isPresent()){
          System.out.println(opt.get());
      }else{
          System.out.println("No match");
      }
    }
}
