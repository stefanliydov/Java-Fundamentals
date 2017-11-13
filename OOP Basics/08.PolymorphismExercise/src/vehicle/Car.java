package vehicle;

public class Car extends Vehicle {


     Car(double fuel, double litersPerKm,double tankCapacity) {
        super(fuel, litersPerKm+0.9, tankCapacity);
    }

    @Override
    protected void drive(double km) {
        double fuel = super.getLitersPerKm()*km;
        if(fuel> super.getFuel()){
            throw new IllegalArgumentException("Car needs refueling");
        }
        System.out.println(String.format("Car travelled %s km",Vehicle.DECIMAL_FORMAT.format(km)));
        super.setFuel(-fuel);
    }


    @Override
    protected void refuel(double fuel) {
        if(fuel<=0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if(fuel+super.getFuel()>super.getTankCapacity()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        super.setFuel(fuel);
    }
}
