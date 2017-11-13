package avatar.monuments;

public class AirMonument extends Monument {

    private int airAffinity;

    public AirMonument(String name, int airAffinity) {
        super(name);
        this.airAffinity=airAffinity;
    }

    @Override
    public int getPower() {
        return this.airAffinity;
    }

    @Override
    public String toString() {
        return String.format("\n###Air Monument: %s, Air Affinity: %s",super.getName(),this.airAffinity);
    }
}
