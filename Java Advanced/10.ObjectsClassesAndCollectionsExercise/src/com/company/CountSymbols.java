package com.company;

import java.util.*;

public class CountSymbols {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character,Integer> map = new HashMap<>();
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char sym = text.charAt(i);
            if(!map.containsKey(sym)){
                map.put(sym,0);
            }
            map.put(sym,map.get(sym)+1);
        }
        Map<Character,Integer> treeMap= new TreeMap<>(map);
        for (char key : treeMap.keySet()){
            System.out.println(String.format("%s: %s time/s",key, treeMap.get(key) ));
        }
    }
}
