package com.company;

import java.util.*;

public class MapDistricts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, List<Integer>>cities = new HashMap<>();
        List<String> tokens = Arrays.asList(scanner.nextLine().split("\\s+"));
        int minPop = Integer.parseInt(scanner.nextLine());
        for (String token : tokens) {
            String[] temp = token.split(":");
            String city = temp[0];
            int pop =Integer.parseInt(temp[1]);
            if(!cities.containsKey(city)){
                cities.put(city, new ArrayList<Integer>());
            }
            cities.get(city).add(pop);
        }

        cities
                .entrySet()
                .stream()
                .filter(x-> x.getValue().stream().reduce((x1,x2)-> x1+x2).get()>minPop)
                .sorted((x,y) -> y.getValue().stream().reduce((x1,x2)-> x1+x2).get().compareTo(x.getValue().stream().reduce((x1,x2)-> x1+x2).get()))
                .forEach(x->{
                    System.out.print(x.getKey()+": ");

                    for(Object pop:x.getValue().stream().sorted((x1,x2)->x2.compareTo(x1)).limit(5).toArray()){
                        System.out.print(pop+" ");
                    }
                    System.out.println();
                });

    }
}
