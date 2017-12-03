package cards_with_power;

public class Card implements Comparable<Card> {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %s",this.rank,this.suit,calculatePower());
    }

    private int calculatePower() {
        return rank.getPower()+suit.getPower();
    }

    @Override
    public int compareTo(Card o) {
        return this.calculatePower()-calculatePower();
    }
}
