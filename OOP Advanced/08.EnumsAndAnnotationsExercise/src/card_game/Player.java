package card_game;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Player {

    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }
    public void addCardToDeck(Card card){
        this.hand.add(card);
    }
    public int getHandSize(){
        return this.hand.size();
    }
    public Card getStrongestCard(){
       Optional<Card> card = this.hand.stream().sorted((x,y)-> y.compareTo(x)).findFirst();

       return card.get();
    }

    public String getName() {
        return this.name;
    }
}
