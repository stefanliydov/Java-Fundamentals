package hell.engine;

import hell.comparators.HeroComparator;
import hell.entities.miscellaneous.HeroInventory;
import hell.entities.miscellaneous.hero.*;
import hell.entities.miscellaneous.items.BaseItem;
import hell.entities.miscellaneous.items.CommonItem;
import hell.entities.miscellaneous.items.RecipeItem;
import hell.handlers.CommandHandler;
import hell.interfaces.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Engine {
    private final static String TERMINATE_COMMAND = "Quit";

    private InputReader reader;
    private OutputWriter writer;
    private CommandHandler handler;

    public Engine(InputReader reader, OutputWriter writer, CommandHandler handler) {
        this.reader = reader;
        this.writer = writer;
        this.handler=handler;
    }

    public void run() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Map<String, Hero> heroes = new LinkedHashMap<>();

        while(true){
            String[] line = reader.readLine().split(" ");
            if(line[0].equals(TERMINATE_COMMAND)){
                break;
            }
            switch (line[0]){
                case "Hero":
                    HeroStatsEnum heroEnum = HeroStatsEnum.valueOf(line[2].toUpperCase());
                    if(line[2].equals("Barbarian")){
                        heroes.put(line[1],
                                new Barbarian(line[1],heroEnum.getStrength(),heroEnum.getAgility()
                                        ,heroEnum.getIntelligence(),heroEnum.getHitpoints(),heroEnum.getDamage()
                                        ,new HeroInventory()));
                    }
                   else if(line[2].equals("Assassin")){
                        heroes.put(line[1],
                                new Assassin(line[1],heroEnum.getStrength(),heroEnum.getAgility()
                                        ,heroEnum.getIntelligence(),heroEnum.getHitpoints(),heroEnum.getDamage()
                                        ,new HeroInventory()));
                    }
                   else if(line[2].equals("Wizard")){
                        heroes.put(line[1],
                                new Wizard(line[1],heroEnum.getStrength(),heroEnum.getAgility()
                                        ,heroEnum.getIntelligence(),heroEnum.getHitpoints(),heroEnum.getDamage()
                                        ,new HeroInventory()));
                    }
                writer.writeLine(String.format("Created %s - %s",line[2],line[1]));
                    break;
                case "Item":
                    Item newCommonItem = new CommonItem(line[1],
                            Integer.parseInt(line[3]),
                            Integer.parseInt(line[4]),
                            Integer.parseInt(line[5]),
                            Integer.parseInt(line[6]),
                            Integer.parseInt(line[7]));
                    heroes.get(line[2]).addItem(newCommonItem);
                    writer.writeLine(String.format("Added item - %s to Hero - %s",line[1],line[2]));
                    break;
                case "Recipe":
                    Recipe newItemRecipe = new RecipeItem(line[1],
                            Integer.parseInt(line[3]),
                            Integer.parseInt(line[4]),
                            Integer.parseInt(line[5]),
                            Integer.parseInt(line[6]),
                            Integer.parseInt(line[7]),
                            Arrays.stream(line).skip(8).collect(Collectors.toList()));
                    heroes.get(line[2]).addRecipe(newItemRecipe);
                    writer.writeLine(String.format("Added recipe - %s to Hero - %s",line[1],line[2]));
                    break;
                case "Inspect":
                    writer.writeLine(InspectHero.inspect(heroes.get(line[1])));
                    break;
            }
        }

        List<Hero> heroesSorted = new LinkedList<>(heroes.values());
        heroesSorted.sort(new HeroComparator());
        StringBuilder sb =new StringBuilder();

        int count =1;
        for (Hero hero:
            heroesSorted) {
            sb.append(String.format("%d%s",count,InspectHero.printHeroInfo(hero)));
            count++;
        }
        writer.writeLine(sb.toString());
    }
}
