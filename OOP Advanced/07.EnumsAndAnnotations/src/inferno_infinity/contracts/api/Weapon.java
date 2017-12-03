package inferno_infinity.contracts.api;

import inferno_infinity.annotations.CustomAnnotation;
import inferno_infinity.enums.GemTypes;



@CustomAnnotation
public interface Weapon extends Comparable<Weapon> {
    public void addGem(GemTypes gem, int index);
    public void removeGem(int index);
    double getLevel();
    public String printBiggerStats();
    public void addBonusStats();
}
