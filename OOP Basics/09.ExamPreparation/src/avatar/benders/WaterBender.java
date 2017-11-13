package avatar.benders;

public class WaterBender extends Bender {

    private double waterClarity;

    public WaterBender( String name, int power, double secondaryParameter) {
        super(name, power);
        this.waterClarity = secondaryParameter;
    }

    @Override
    public double totalPower() {
        return this.waterClarity*super.getPower();
    }

    @Override
    public String toString() {
        return String.format("\n###Water Bender: %s, Power: %s, Water Clarity: %.2f",super.getName(),super.getPower(),this.waterClarity);
    }
}
