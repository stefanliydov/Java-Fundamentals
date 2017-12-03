package coffee_machine;

public enum CoffeeSize {
    SMALL (50, 50), NORMAL (100 , 75), DOUBLE (200 , 100);

    private int size;
    private int value;

    CoffeeSize(int size, int value) {
        this.size = size;
        this.value = value;
    }

    public int getSize() {
        return this.size;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        String lower = super.name().substring(1).toLowerCase();
        return super.toString().charAt(0)+ lower;
    }
}
