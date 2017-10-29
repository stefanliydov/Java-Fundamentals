package SpeedRacer;

public class Car {

    private static final int DEFAULT_DISTANCE_TRAVELLED=0;
    private String model;
    private double fuel;
    private double costPerKm;
    private int distanceTravelled;

    public Car(String model, double fuel, double costPerKm){
        this.model = model;
        this.fuel = fuel;
        this.costPerKm = costPerKm;
        this.distanceTravelled=DEFAULT_DISTANCE_TRAVELLED;
    }

    public void drive(int distance){
        double fuelForDrive = distance*this.costPerKm;
        if(fuelForDrive> this.fuel){
            throw new IllegalStateException("Insufficient fuel for the drive");
        }
            this.distanceTravelled+=distance;
            this.fuel-=fuelForDrive;

    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d",this.model,this.fuel,this.distanceTravelled);
    }
}
