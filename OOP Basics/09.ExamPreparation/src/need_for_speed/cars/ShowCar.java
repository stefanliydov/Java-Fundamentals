package need_for_speed.cars;

public class ShowCar extends Car {

    private int stars;

    public ShowCar(String brand, String model, int yearOfProduction, int horsePower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsePower, acceleration, suspension, durability);
        stars = 0;
    }

    @Override
    public void tune(int tuneIndex, String addOn) {
        this.stars+=tuneIndex;
        super.tune(tuneIndex, addOn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.stars).append(" *");

        return super.toString() + sb.toString();
    }
}
