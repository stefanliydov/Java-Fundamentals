package com.company;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Students {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> students = new LinkedHashMap<>();
        while(true){

            String[] line = scanner.nextLine().split("\\s+");

            if(line[0].equals("END")){
                break;
            }
            String facNum = line[0];
            List<String> grades = new ArrayList<>();

            for (int i = 1; i < line.length; i++) {
                grades.add(line[i]);
            }

            students.put(facNum, grades);
        }


        students.entrySet().stream().filter(x -> x.getKey().substring(4,6).equals("14")||x.getKey().substring(4,6).equals("15")).forEach(x-> System.out.println(String.join(" ",x.getValue())));

    }
}
