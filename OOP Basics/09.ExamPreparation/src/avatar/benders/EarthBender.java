package avatar.benders;

public class EarthBender extends Bender {

    private double groundSaturation;

    public EarthBender( String name, int power, double secondaryParameter) {
        super( name, power);
        this.groundSaturation= secondaryParameter;
    }

    @Override
    public double totalPower() {
        return this.groundSaturation*super.getPower();
    }

    @Override
    public String toString() {
        return String.format("\n###Earth Bender: %s, Power: %s, Ground Saturation: %.2f",super.getName(),super.getPower(),this.groundSaturation);
    }
}
