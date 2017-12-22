package hell.entities.miscellaneous.items;

public class CommonItem extends BaseItem {

    public CommonItem(String name, int strengthBonus, int agilityBonus, int intelliganceBonus, int hitPointsBonus, int damageBonus) {
        super(name, strengthBonus, agilityBonus, intelliganceBonus, hitPointsBonus, damageBonus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //###Item: {item1Name}
//###+{strengthBonus} Strength
//###+{agilityBonus} Agility
//###+{intelligenceBonus} Intelligence
//###+{hitpointsBonus} HitPoints
//###+{damageBonus} Damage
        sb.append("###Item: ").append(super.getName()).append("\n");
        sb.append("###+").append(super.getStrengthBonus()).append(" Strength").append("\n");
        sb.append("###+").append(super.getAgilityBonus()).append(" Agility").append("\n");
        sb.append("###+").append(super.getIntelligenceBonus()).append(" Intelligence").append("\n");
        sb.append("###+").append(super.getHitPointsBonus()).append(" HitPoints").append("\n");
        sb.append("###+").append(super.getDamageBonus()).append(" Damage");

        return sb.toString();
    }
}
