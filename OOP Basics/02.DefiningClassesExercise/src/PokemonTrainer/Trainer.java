package PokemonTrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trainer {

    private String name;
    private int badges=0;
    private List<Pokemon> pokemons;

    public Trainer(String name){
        this.name= name;
        this.pokemons = new ArrayList<>();
    }
    public void CatchPokemon(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }
    public void addBadge(){
        this.badges++;
    }
    public List<Pokemon> getPokemons(){
        return this.pokemons.stream().filter(x->x.getHealth()>=0).collect(Collectors.toList());
    }

    public int getBadges() {
        return badges;
    }
}
