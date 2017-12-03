package testUnit;

import lab.interfaces.Target;
import lab.interfaces.Weapon;

public class Axe implements Weapon{

    private int attackPoints;
    private int durabilityPoints;

    public Axe(int attack, int durability) {
        this.attackPoints = attack;
        this.durabilityPoints = durability;
    }

    public int getAttackPoints() {
        return this.attackPoints;
    }

    public int getDurabilityPoints() {
        return this.durabilityPoints;
    }

    public void attack(Target target) {
        if (this.durabilityPoints <= 0) {
            throw new IllegalStateException("lab.Axe is broken.");
        }

        target.takeAttack(this.attackPoints);
        this.durabilityPoints -= 1;
    }
}
