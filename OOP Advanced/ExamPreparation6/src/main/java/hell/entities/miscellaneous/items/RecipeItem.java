package hell.entities.miscellaneous.items;

import hell.interfaces.Recipe;

import java.util.Collections;
import java.util.List;

public class RecipeItem extends BaseItem implements Recipe {

    private List<String> requiredItems;

    public RecipeItem(String name, int strengthBonus, int agilityBonus,
                      int intelliganceBonus, int hitPointsBonus, int damageBonus, List<String> requiredItems) {
        super(name, strengthBonus, agilityBonus, intelliganceBonus, hitPointsBonus, damageBonus);
        this.requiredItems = requiredItems;
    }

    @Override
    public List<String> getRequiredItems() {
        return Collections.unmodifiableList(this.requiredItems);
    }
}
