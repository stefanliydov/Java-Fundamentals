package coffee_machine;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {

    private List<Coffee> coffeeSold;
    private List<Coin> coins;
    public CoffeeMachine() {
        this.coffeeSold = new ArrayList<>();
        this.coins = new ArrayList<>();
    }
    public void insertCoin(Coin coin){
        this.coins.add(coin);
    }
    public void buyCoffee(String size, String type) {
    }

    public void insertCoin(String coin) {
    }

    public Iterable<Coffee> coffeesSold() {
        return this.coffeeSold;
    }
    public void buyCoffee(Coffee coffee){
        int val = this.coins.stream().map(Coin::getValue).mapToInt(Integer::valueOf).sum();
       if(coffee.getValue()<=val){
           this.coffeeSold.add(coffee);
           this.coins.clear();
       }
    }

}
