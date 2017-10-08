package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PopulationCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, HashMap<String, Long>> statistic = new LinkedHashMap<>();
        LinkedHashMap<String, Long> totalCountryPopulation = new LinkedHashMap<>();
        while(true){
            String[] line = scanner.nextLine().split("\\|");
            if(line[0].equals("report")){
                break;
            }
            String city = line[0];
            String country = line[1];
            Long population = Long.parseLong(line[2]);

            if(!statistic.containsKey(country)){
                statistic.put(country, new HashMap<String, Long>());
                totalCountryPopulation.put(country,0L);
            }
            totalCountryPopulation.put(country,totalCountryPopulation.get(country)+population);
            if(!statistic.get(country).containsKey(city)){
                statistic.get(country).put(city, population);
            }
        }

     /*  statistic.entrySet().stream()
                .sorted((c1,c2)-> totalCountryPopulation.get(c2.getKey()).compareTo(totalCountryPopulation.get(c1.getKey())))
                .forEach(country ->{
                    System.out.format("%s (total population: %d)\n",country.getKey(),totalCountryPopulation.get(country.getKey()));
                    country.getValue().entrySet()
                            .stream().sorted((t1,t2)-> t2.getValue().compareTo(t1.getValue())).forEach(city ->{
                        System.out.format("=>%s: %d\n", city.getKey(),city.getValue());
                    });
                });*/


        statistic.entrySet().stream()
                .sorted((c1,c2) -> totalCountryPopulation.get(c2.getKey()).compareTo(totalCountryPopulation.get(c1.getKey())))
                .forEach(country ->{
                    System.out.format("%s (total population: %s)\n", country.getKey(),totalCountryPopulation.get(country.getKey()));
                    country.getValue().entrySet().stream()
                            .sorted((c1,c2)-> c2.getValue().compareTo(c1.getValue()))
                            .forEach(city->{
                                System.out.format("=>%s: %s\n",city.getKey(),city.getValue());
                            });
                });


    }
}
