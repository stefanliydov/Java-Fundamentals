package com.company;

import java.util.*;

public class SoftUniParty {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> guests = new TreeSet<String>();
        Set<String> vip = new TreeSet<String>();




        while(true){
         String line  =scanner.nextLine();
         if(line.equalsIgnoreCase("party")){
             break;
         }
         if(Character.isDigit(line.charAt(0))){
             vip.add(line);
         }
         else{
             guests.add(line);
         }

        }

        while(true){
            String line = scanner.nextLine();
            if(line.equalsIgnoreCase("end")){
                break;
            }
            if(guests.contains(line)){
                guests.remove(line);
            }
            else if(vip.contains(line)){
                vip.remove(line);
            }
        }
        int total = guests.size()+vip.size();
        System.out.println(total);
        for (String guest:vip){
            System.out.println(guest);
        }
        for(String guest:guests){
            System.out.println(guest);
        }

    }
}
