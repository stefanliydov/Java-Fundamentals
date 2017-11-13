package avatar.monuments;

public class EarthMonument extends Monument {

    private int earthAffinity;
    public EarthMonument(String name, int earthAffinity) {
        super(name);
        this.earthAffinity = earthAffinity;
    }


    @Override
    public int getPower() {
        return this.earthAffinity;
    }

    @Override
    public String toString() {
        return String.format("\n###Earth Monument: %s, Earth Affinity: %s",super.getName(),this.earthAffinity);
    }
}
