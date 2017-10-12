package com.company;

import java.util.*;

public class ExcellentStudents {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> students = new LinkedHashMap<>();

        while(true){

            String[] line  = scanner.nextLine().split("\\s+");
            if(line[0].equals("END")){
                break;
            }
            List<String> grades = new ArrayList<>();
            String name = line[0]+" "+line[1];
            for (int i = 2; i <line.length ; i++) {
                grades.add(line[i]);
            }
            students.put(name, grades);
        }

        students.entrySet().stream().filter(x -> x.getValue().contains("6")).forEach(x -> System.out.println(x.getKey()));
    }
}
