package PokemonTrainer;

public class Pokemon {

    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health){
        this.name=name;
        this.element = element;
        this.health = health;
    }
    public void decreaseHp(){
        this.health-=10;
    }

    public String getElement() {
        return element;
    }

    public int getHealth() {
        return health;
    }
}
