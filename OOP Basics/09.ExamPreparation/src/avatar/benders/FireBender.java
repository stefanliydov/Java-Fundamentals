package avatar.benders;

public class FireBender extends Bender {

    private double heatAggression;

    public FireBender( String name, int power, double secondaryParameter) {
        super(name, power);
        this.heatAggression = secondaryParameter;
    }

    @Override
    public double totalPower() {
        return this.heatAggression*super.getPower();
    }

    @Override
    public String toString() {
        return String.format("\n###Fire Bender: %s, Power: %s, Heat Aggression: %.2f",super.getName(),super.getPower(),this.heatAggression);
    }
}
