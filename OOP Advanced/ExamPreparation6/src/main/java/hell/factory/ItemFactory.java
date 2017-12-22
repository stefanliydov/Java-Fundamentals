package hell.factory;

import hell.entities.miscellaneous.items.CommonItem;
import hell.interfaces.Item;

public final class ItemFactory {

    private ItemFactory(){

    }

    public static Item createCommonItem(String name, int strengthBonus, int agilityBonus, int intelliganceBonus, int hitPointsBonus, int damageBonus){
        return new CommonItem(name, strengthBonus,agilityBonus,intelliganceBonus,hitPointsBonus,damageBonus);
    }
}
