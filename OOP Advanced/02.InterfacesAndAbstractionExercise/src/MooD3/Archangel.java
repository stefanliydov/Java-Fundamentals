package MooD3;

public class Archangel extends BaseGameObject {

    private double mana;
    public Archangel(String username, int level,double mana) {
        super(username, level);
        this.mana = mana;

    }

    @Override
    protected String generateHashPassword() {
        return new StringBuilder(super.getUsername()).reverse().toString()+(super.getUsername().length()*21);
    }

    @Override
    public double getSpecialPower() {
        return this.mana;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("%.0f",this.getSpecialPower()*this.getLevel());
    }
}
