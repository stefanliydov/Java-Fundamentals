package hell.entities.miscellaneous.hero;

import hell.interfaces.Hero;
import hell.interfaces.Item;

import java.util.Collection;
import java.util.stream.Collectors;

public class InspectHero {

    public static String inspect(Hero hero) throws IllegalAccessException {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Hero: %s, Class: %s\n",hero.getName(),hero.getClass().getSimpleName()));
        sb.append(String.format("HitPoints: %s, Damage: %s\n",hero.getHitPoints(),hero.getDamage()));
        sb.append(String.format("Strength: %s\n",hero.getStrength()));
        sb.append(String.format("Agility: %s\n",hero.getAgility()));
        sb.append(String.format("Intelligence: %s\n",hero.getIntelligence()));
        sb.append("Items:");
        Collection<Item> items = hero.getItems();
        if(items.size() ==0){
            sb.append(" None");
        } else{
            sb.append(System.lineSeparator());
            for (Item item:
                 items) {
                sb.append(item.toString());
            }
        }
        return sb.toString();
    }
    public static String printHeroInfo(Hero hero) throws IllegalAccessException {
        StringBuilder sb= new StringBuilder();
//        1. {heroType}: {heroName}
//###HitPoints: {hitpoints}
//###Damage: {damage}
//###Strength: {strength}
//###Agility: {agility}
//###Intelligence: {intelligence}
//###Items: {item1Name}, {item2Name}, {item3Name}. . .
        sb.append(String.format(". %s: %s\n",hero.getClass().getSimpleName(),hero.getName()));
        sb.append("###HitPoints: ").append(hero.getHitPoints()).append(System.lineSeparator());
        sb.append("###Damage: ").append(hero.getDamage()).append(System.lineSeparator());
        sb.append("###Strength: ").append(hero.getStrength()).append(System.lineSeparator());
        sb.append("###Agility: ").append(hero.getAgility()).append(System.lineSeparator());
        sb.append("###Intelligence: ").append(hero.getIntelligence()).append(System.lineSeparator());
        sb.append("###Items: ");
        Collection<Item> items = hero.getItems();
        if(items.size() ==0){
            sb.append("None");
        }else{

                sb.append(String.join(", ",items.stream().map(Item::getName).collect(Collectors.toList())));

        }
        return sb.toString()+"\n";
    }
}
