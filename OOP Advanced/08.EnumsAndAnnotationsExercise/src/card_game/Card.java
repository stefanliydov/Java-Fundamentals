package card_game;

public class Card implements Comparable<Card> {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s",this.rank,this.suit );
    }

    private int calculatePower() {
        return rank.getPower()+suit.getPower();
    }

    @Override
    public int compareTo(Card o) {
        return this.calculatePower()-o.calculatePower();
    }
    public static int getBiggerCard(Card card, Card card2){
        if(card.compareTo(card2) < 0){
            return 2;
        }
        return 1;
    }

}
