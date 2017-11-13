package avatar.benders;

public class AirBender extends Bender {

    private double aerialIntegrity;

    public AirBender( String name, int power, double secondaryParameter) {
        super(name, power);
        this.aerialIntegrity = secondaryParameter;
    }


    @Override
    public double totalPower() {
        return this.aerialIntegrity*super.getPower();
    }

    @Override
    public String toString() {
        return String.format("\n###Air Bender: %s, Power: %s, Aerial Integrity: %.2f",super.getName(),super.getPower(),this.aerialIntegrity);
    }
}
