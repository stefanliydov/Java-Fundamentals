package hell.entities.miscellaneous.hero;

import hell.interfaces.Inventory;

public class Barbarian extends BaseHero {

    public Barbarian(String name, int strength, int agility, int intelligence, int hitPoints, int damage, Inventory inventory) {
        super(name, strength, agility, intelligence, hitPoints, damage, inventory);
    }
}
