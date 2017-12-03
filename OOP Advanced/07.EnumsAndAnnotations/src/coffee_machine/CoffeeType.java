package coffee_machine;

public enum CoffeeType {
    ESPRESSO, LATTE, IRISH;
    @Override
    public String toString() {
        String lower = super.name().substring(1).toLowerCase();
        return super.name().charAt(0) + lower;
    }
}
