package avatar.monuments;

public class WaterMonument extends Monument {

    private int waterAffinity;

    public WaterMonument(String name, int waterAffinity) {
        super(name);
        this.waterAffinity = waterAffinity;
    }

    @Override
    public int getPower() {
        return this.waterAffinity;
    }

    @Override
    public String toString() {
        return String.format("\n###Water Monument: %s, Water Affinity: %s",super.getName(),this.waterAffinity);
    }
}
