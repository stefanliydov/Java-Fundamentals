package PokemonTrainer;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Trainer> trainers = new LinkedHashMap<>();
        while (true){

            String[] line = scanner.nextLine().split("\\s+");

            if(line[0].equals("Tournament")){
                break;
            }
            String name = line[0];
            String pokName = line[1];
            String element = line[2];
            int health = Integer.parseInt(line[3]);

            Pokemon newPokemon = new Pokemon(pokName,element,health);
            trainers.putIfAbsent(name, new Trainer(name));
            trainers.get(name).CatchPokemon(newPokemon);
        }

            while(true) {
                String element = scanner.nextLine();
                if (element.equals("End")) {
                    break;
                }

                for (Trainer trainer:
                        trainers.values()) {
                    boolean contains = false;
                    for (Pokemon pokemon:
                         trainer.getPokemons()) {
                        if(pokemon.getElement().equals(element)){
                            contains = true;
                        }
                    }
                    if(!contains){
                        for (Pokemon pokemon:
                                trainer.getPokemons()) {
                         pokemon.decreaseHp();
                        }
                    }else{
                        trainer.addBadge();
                    }
                }
            }

            trainers.entrySet().stream()
                    .sorted((x,y) -> {
                        Integer x1 = x.getValue().getBadges();
                        Integer y1 = y.getValue().getBadges();
                        return y1.compareTo(x1);
                    })
                    .forEach(x-> System.out.println(x.getKey()+" "+x.getValue().getBadges()+" "+x.getValue().getPokemons().size()));
    }

}
