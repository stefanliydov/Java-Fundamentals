package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateParty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] guests = scanner.nextLine().split(" ");
        List<String> guestList = new ArrayList<>(Arrays.asList(guests));


        while(true){
            String[] line = scanner.nextLine().split(" ");
            if(line[0].equals("Party!")){
                break;
            }
            String action = line[0];
            String command = line[1];
            String parameters = line[2];
            Predicate<String> conditions = predicateMethod(command,parameters);

            for (int i = 0; i < guestList.size(); i++) {
               String guest = guestList.get(i);
                if(conditions.test(guest)){
                    if(action.equals("Remove")){
                        guestList.remove(i);
                        i--;
                    }
                    else if(action.equals("Double")){
                        guestList.add(i,guest);
                        i++;
                    }
                }
            }
        }
            print(guestList);
    }
    private static Predicate<String> predicateMethod(String command, String parameters){
        switch (command){
            case "StartsWith":
                return x-> x.substring(0,parameters.length()).equals(parameters);
            case "EndsWith":
                return x-> x.substring(x.length()-parameters.length(),x.length()).equals(parameters);
            case "Length":
                int length = Integer.parseInt(parameters);
                return x->x.length()==length;
                default:
                    return null;
        }
    }
    private static void print(List<String> list){
        if(list.size()==0){
            System.out.println("Nobody is going to the party!");
        }else{
            System.out.println(String.join(", ",list)+" are going to the party!");
        }
    }
}
