package MooD3;

public class Demon extends BaseGameObject {

    private double energy;

    protected Demon(String username, int level,double
            energy) {
        super(username, level);
        this.energy = energy;
    }

    @Override
    protected String generateHashPassword() {
        return String.valueOf(super.getUsername().length()*217);
    }

    @Override
    public double getSpecialPower() {
        return this.energy;
    }
    @Override
    public String toString() {
        return super.toString()+String.format("%.1f",this.getSpecialPower()*this.getLevel());
    }


}
