package need_for_speed.cars;

public abstract class Car {

    private String brand;
    private String model;
    private int yearOfProduction;


    private int horsePower;
    private int acceleration;
    private int suspension;
    private int durability;

    protected Car(String brand, String model, int yearOfProduction, int horsePower, int acceleration, int suspension, int durability) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.setHorsePower(horsePower);
        this.acceleration = acceleration;
        this.setSuspension(suspension);
        this.durability = durability;
    }

    public int getHorsePower() {
        return this.horsePower;
    }
    public String getBrand() {
        return this.brand;
    }
    public String getModel() {
        return this.model;
    }
    public int getAcceleration() {
        return this.acceleration;
    }
    public int getSuspension() {
        return this.suspension;
    }
    public int getDurability() {
        return this.durability;
    }


    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.brand).append(" ").append(this.model).append(" ").append(this.yearOfProduction).append("\n");
        sb.append(this.horsePower).append(" HP, ").append("100 m/h in ").append(this.acceleration).append(" s\n");
        sb.append(this.suspension).append(" Suspension force, ").append(this.durability).append(" Durability\n");
        return sb.toString();
    }

    public void tune(int tuneIndex, String addOn) {
        this.horsePower+= tuneIndex;
        this.suspension+= ((tuneIndex*50)/100);
    }
}
