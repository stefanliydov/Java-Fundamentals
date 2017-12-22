package hell.comparators;

import hell.interfaces.Hero;

import java.util.Comparator;

public class HeroComparator implements Comparator<Hero> {

    @Override
    public int compare(Hero a, Hero b) {
        Long aValue = a.getStrength() + a.getAgility() + a.getIntelligence();
        Long bValue = b.getStrength() + b.getAgility() + b.getIntelligence();

        if (aValue.equals(bValue)) {
            Long aVal = a.getHitPoints() + a.getHitPoints();
            Long bVal = b.getHitPoints() + b.getDamage();
            return Long.compare(bVal,aVal);
        }
        return Long.compare(bValue,aValue);
    }
}
