package card_suit;

public enum Card {
    CLUBS,DIAMONDS, HEARTS, SPADES;

    @Override
    public String toString() {
        return String.format("Ordinal value: %s; Name value: %s",this.ordinal(),this.name());
    }
}
