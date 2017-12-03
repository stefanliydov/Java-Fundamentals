package card_game;

import java.util.HashMap;
import java.util.Map;
public class Deck {

private Map<String, Card> allCards;
    public Deck() {
        this.allCards = new HashMap<>();
        this.initializeCards();
    }

    public Card getCard(String name){
        if(!this.allCards.containsKey(name)){
            throw new IllegalArgumentException("No such card exists.");
        }
        if(this.allCards.get(name)==null) {
            throw new IllegalArgumentException("Card is not in the deck.");
        }
        Card card = this.allCards.get(name);
            this.allCards.put(name, null);
        return card;
    }

    private void initializeCards() {
        for (Suit suit:
             Suit.values()) {
            for (Rank rank:
                    Rank.values()){
                Card card = new Card(Rank.valueOf(rank.name()),Suit.valueOf(suit.name()));
                this.allCards.put(card.toString(),card);
            }
        }
    }
}
