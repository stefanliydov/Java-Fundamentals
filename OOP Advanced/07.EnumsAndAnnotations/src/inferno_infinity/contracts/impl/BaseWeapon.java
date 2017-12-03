package inferno_infinity.contracts.impl;

import inferno_infinity.contracts.api.Weapon;
import inferno_infinity.enums.GemTypes;
import inferno_infinity.enums.WeaponTypes;

public abstract class BaseWeapon implements Weapon {

    private String name;
    private WeaponTypes weapon;
    private GemTypes[] gems;
    private int minDmg;
    private int maxDmg;
    private int bonusStrength;
    private int bonusAgility;
    private int bonusVitality;

    public BaseWeapon(String name, WeaponTypes weapon) {
        this.name = name;
        this.weapon = weapon;
        this.maxDmg = weapon.getMaxDmg();
        this.minDmg = weapon.getMinDmg();
        this.bonusStrength = 0;
        this.bonusAgility = 0;
        this.bonusVitality = 0;
        this.gems = new GemTypes[weapon.getSockets()];
    }

    @Override
    public void addGem(GemTypes gem, int index) {
        if (index < this.gems.length && index >= 0) {
            this.gems[index] = gem;
        }
    }

    @Override
    public void removeGem(int index) {
        if (index < this.gems.length && index >= 0) {
            this.gems[index] = null;
        }
    }

    @Override
    public String toString() {
        addBonusStats();
        return String.format("%s: %s-%s Damage, +%s Strength, +%s Agility, +%s Vitality",
                this.name,this.minDmg,this.maxDmg,this.bonusStrength,this.bonusAgility,this.bonusVitality);
    }

    @Override
    public int compareTo(Weapon o) {
        this.addBonusStats();
        o.addBonusStats();
        if(this.getLevel()-o.getLevel()>=0){
            return 1;
        }
        return -1;
    }
    @Override
    public String printBiggerStats(){
            return String.format("%s: %s-%s Damage, +%s Strength, +%s Agility, +%s Vitality (Item Level: %.1f)",
                    this.name, this.minDmg, this.maxDmg, this.bonusStrength, this.bonusAgility, this.bonusVitality, this.getLevel());
    }

     public double getLevel(){
        return ((this.minDmg+this.maxDmg)/2.0)+this.bonusStrength+this.bonusAgility+this.bonusVitality;
    }
    @Override
    public void addBonusStats() {
        for (GemTypes gem :
                this.gems) {
            if (gem != null) {
                this.bonusStrength += gem.getStrength();
                this.bonusAgility += gem.getAgility();
                this.bonusVitality += gem.getVitality();
            }
        }
        setMinDmg();
        setMaxDmg();
    }

    private void setMinDmg() {
        this.minDmg += 2 * this.bonusStrength;
        this.minDmg += this.bonusAgility;
    }

    private void setMaxDmg() {
        this.maxDmg += 3 * this.bonusStrength;
        this.maxDmg += 4 * this.bonusAgility;
    }

}
