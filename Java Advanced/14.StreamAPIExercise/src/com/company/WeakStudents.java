package com.company;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WeakStudents {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<Integer>> students = new LinkedHashMap<>();

        while(true){

            String[] line  = scanner.nextLine().split("\\s+");
            if(line[0].equals("END")){
                break;
            }
            List<Integer> grades = new ArrayList<>();
            String name = line[0]+" "+line[1];
            for (int i = 2; i <line.length ; i++) {
                grades.add(Integer.parseInt(line[i]));
            }
           grades = grades.stream().filter(x -> x<=3).collect(Collectors.toList());
            students.put(name,grades );
        }

        students.entrySet().stream().filter(x -> x.getValue().size()>=2).forEach(x -> System.out.println(x.getKey()));

    }
}
