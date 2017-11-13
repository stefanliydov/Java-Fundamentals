package avatar.monuments;

public class FireMonument extends Monument {

    private int fireAffinity;

    public FireMonument(String name, int fireAffinity) {
        super(name);
        this.fireAffinity = fireAffinity;
    }

    @Override
    public int getPower() {
        return this.fireAffinity;
    }

    @Override
    public String toString() {
        return String.format("\n###Fire Monument: %s, Fire Affinity: %s",super.getName(),this.fireAffinity);
    }
}
