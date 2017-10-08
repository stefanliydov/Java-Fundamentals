package com.company;

import java.util.*;

public class HandsOfCards {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, HashSet<String>> players = new LinkedHashMap<>();
        while(true){
            String[] line = scanner.nextLine().split(": ");
            if(line[0].equals("JOKER")){
                break;
            }
            String player = line[0];
            String[] cardsSplit = line[1].split(", ");
            HashSet<String> cards = new HashSet<>(Arrays.asList(cardsSplit));


            if(!players.containsKey(player)){
                players.put(player,new HashSet<String>());
            }
            for (String card:
                 cards) {
                players.get(player).add(card);
            }

        }
        for (String player:players.keySet()
             ) {
            int sum = 0;
            HashSet<String> currSet = players.get(player);
           for(String card:currSet){
               sum+=cardPoints(card);
           }
            System.out.println(player+": "+sum);
        }
      //  players.forEach((k,v) -> System.out.println(k+": "+v));
    }
    private static int cardPoints(String card){
        int currPoints=0;

            switch (card.charAt(0)) {
                case 'J':
                    currPoints += 11;
                    break;
                case 'Q':
                    currPoints += 12;
                    break;
                case 'K':
                    currPoints += 13;
                    break;
                case 'A':
                    currPoints += 14;
                    break;
                case '1':
                    currPoints+=10;
                    break;
                default:
                    currPoints += Character.getNumericValue(card.charAt(0));
            }

        switch (card.charAt(card.length()-1)){
            case 'S':
                currPoints*= 4;
                break;
            case 'H':
                currPoints*= 3;
                break;
            case 'D':
                currPoints*= 2;
                break;
            case 'C':
                currPoints*= 1;
                break;
        }
        return currPoints;
    }
}
