package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AMinerTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new HashMap<>();

        while(true){
            String line = scanner.nextLine();
            if(line.equalsIgnoreCase("stop")){
                break;
            }
            int quantity = Integer.parseInt(scanner.nextLine());
            if(!resources.containsKey(line)){
                resources.put(line,0);
            }
            resources.put(line,resources.get(line)+quantity);
        }

            resources.forEach((k,v) -> System.out.println(k + " -> " + v));

    }

}
