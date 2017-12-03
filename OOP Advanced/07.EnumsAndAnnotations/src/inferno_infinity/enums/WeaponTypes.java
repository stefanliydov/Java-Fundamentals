package inferno_infinity.enums;

public enum WeaponTypes {
    AXE(5,10,4), SWORD(4,6,3), KNIFE(3,4,2);


    private int minDmg;
    private int maxDmg;
    private int sockets;

    WeaponTypes(int minDmg, int maxDmg, int sockets) {
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
        this.sockets = sockets;
    }
    public int getMinDmg() {
        return this.minDmg;
    }

    public int getMaxDmg() {
        return this.maxDmg;
    }

    public int getSockets() {
        return this.sockets;
    }


}
