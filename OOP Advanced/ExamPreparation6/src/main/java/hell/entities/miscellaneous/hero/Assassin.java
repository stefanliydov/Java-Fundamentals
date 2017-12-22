package hell.entities.miscellaneous.hero;

import hell.interfaces.Inventory;

public class Assassin extends BaseHero {

    public Assassin(String name, int strength, int agility, int intelligence, int hitPoints, int damage, Inventory inventory) {
        super(name, strength, agility, intelligence, hitPoints, damage, inventory);
    }
}
