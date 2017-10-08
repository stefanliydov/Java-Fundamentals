package com.company;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class DragonArmy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, TreeMap<String, int[]>> dragons = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            String type = line[0];
            String dragonName = line[1];
            Integer damage = line[2].equals("null")? 45:Integer.parseInt(line[2]);
            Integer health = line[3].equals("null")? 250:Integer.parseInt(line[3]);
            Integer armor = line[4].equals("null")? 10:Integer.parseInt(line[4]);

            if(!dragons.containsKey(type)){
                dragons.put(type, new TreeMap<String, int[]>());
            }
            dragons.get(type).put(dragonName,new int[]{damage,health,armor});
        }
        for (String type : dragons.keySet()) {
            TreeMap<String, int[]> currDragons = dragons.get(type);
            double averageDmg = 0;
            double averageHealth=0;
            double averageArmor=0;
            for (String s : currDragons.keySet()) {

                averageDmg += currDragons.get(s)[0];
                averageHealth += currDragons.get(s)[1];
                averageArmor += currDragons.get(s)[2];
            }
                averageDmg/=currDragons.size();
                averageHealth/=currDragons.size();
                averageArmor/=currDragons.size();
            System.out.println(String.format("%s::(%.2f/%.2f/%.2f)",type,averageDmg,averageHealth,averageArmor));
            for (String s : currDragons.keySet()) {
                System.out.println(String.format("-%s -> damage: %s, health: %s, armor: %s",s,currDragons.get(s)[0],currDragons.get(s)[1],currDragons.get(s)[2]));
            }
        }
    }
}
