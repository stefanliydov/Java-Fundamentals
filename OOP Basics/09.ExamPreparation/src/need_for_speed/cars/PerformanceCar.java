package need_for_speed.cars;

import java.util.LinkedList;
import java.util.List;

public class PerformanceCar extends Car {

    private List<String> addOns;

    public PerformanceCar(String brand, String model, int yearOfProduction, int horsePower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsePower, acceleration, suspension, durability);
            this.addOns = new LinkedList<>();
    }

    @Override
    public void tune(int tuneIndex, String addOn) {
        this.addOns.add(addOn);
        super.tune(tuneIndex, addOn);
    }

    @Override
    public void setHorsePower(int horsePower) {
        int increasedPower = horsePower+((horsePower*50)/100);
        super.setHorsePower(increasedPower);
    }

    @Override
    public void setSuspension(int suspension) {
        int decreasedSuspension = suspension -((suspension*25)/100);
        super.setSuspension(decreasedSuspension);
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("Add-ons: ");
        if(this.addOns.size()==0){
            sb.append("None");
        }
        sb.append(String.join(", ",this.addOns));
        return super.toString() + sb.toString();
    }
}
