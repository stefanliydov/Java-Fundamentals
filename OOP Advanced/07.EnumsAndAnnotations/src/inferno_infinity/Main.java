package inferno_infinity;

import inferno_infinity.annotations.CustomAnnotation;
import inferno_infinity.contracts.api.Weapon;
import inferno_infinity.contracts.impl.Axe;
import inferno_infinity.contracts.impl.Knife;
import inferno_infinity.contracts.impl.Sword;
import inferno_infinity.enums.GemTypes;
import inferno_infinity.enums.WeaponTypes;


import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Weapon> weapons = new HashMap<>();

        CustomAnnotation annotation = Weapon.class.getAnnotation(CustomAnnotation.class);

        while (true) {
            String[] line = scanner.nextLine().split(";");
            if (line[0].equals("END")) {
                break;
            }
            switch (line[0]) {
                case "Create":
                    WeaponTypes weaponType = WeaponTypes.valueOf(line[1]);
                    Weapon weapon = null;
                    switch (line[1]) {
                        case "AXE":
                            weapon = new Axe(line[2], weaponType);
                            break;
                        case "SWORD":
                            weapon = new Sword(line[2], weaponType);
                            break;
                        case "KNIFE":
                            weapon = new Knife(line[2], weaponType);
                            break;
                    }
                    weapons.put(line[2], weapon);
                    break;
                case "Add":
                    GemTypes gem = GemTypes.valueOf(line[3]);
                    weapons.get(line[1]).addGem(gem, Integer.parseInt(line[2]));
                    break;
                case "Remove":
                    weapons.get(line[1]).removeGem(Integer.parseInt(line[2]));
                    break;
                case "Print":
                    System.out.println(weapons.get(line[1]).toString());
                    break;
                case "Compare":
                    if (weapons.get(line[1]).compareTo(weapons.get(line[2])) >= 0) {
                        System.out.println(weapons.get(line[1]).printBiggerStats());
                    } else {
                        System.out.println(weapons.get(line[2]).printBiggerStats());
                    }
                    break;
                case "Description":
                    System.out.println("Class description: "+annotation.description());
                    break;
                case "Author":
                    System.out.println("Author: "+annotation.author());
                    break;
                case "Revision":
                    System.out.println("Revision: "+annotation.revision());
                    break;
                case "Reviewers":
                    System.out.println("Reviewers: "+String.join(", ",annotation.reviewers()));
                    break;
            }

        }
    }
}
