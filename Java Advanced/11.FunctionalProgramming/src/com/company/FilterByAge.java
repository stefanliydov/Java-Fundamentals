package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> list = new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String[] line = scanner.nextLine().split(", ");
            list.put(line[0],Integer.parseInt(line[1]));
        }
        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

    }
    private static Consumer<Map.Entry<String, Integer>> printFormat(int n){
        switch (n){

        }
    }
    private static Predicate<String> condition(String condition){

    }
    private static Consumer<Map.Entry<String, Integer>> format(String format, LinkedHashMap<String, Integer> people){
        switch (format){
            case "name":
                System.out.printf("",people.get());
                break;
            case "age":
                System.out.printf("",people.get());
                break;
            case "name age":
                System.out.printf("",people.get());
                break;
        }
    }
}
