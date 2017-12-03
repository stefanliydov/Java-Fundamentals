package coffee_machine;

public class Coffee {
    private int value;
    private CoffeeType type;
    private CoffeeSize size;

    public Coffee( CoffeeSize size,CoffeeType type) {
        this.size = size;
        this.type = type;
        this.value = size.getValue();
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return String.format("\"%s %s\" sold", this.size,this.type);
    }
}
