package vehicle;

public class Truck extends  Vehicle {


     Truck(double fuel, double litersPerKm,double tankCapacity) {
        super(fuel, litersPerKm+1.6,tankCapacity);
    }

    @Override
    protected void drive(double km) {
        double fuel = super.getLitersPerKm()*km;
        if(fuel> super.getFuel()){
            throw new IllegalArgumentException("Truck needs refueling");
        }
        System.out.println(String.format("Truck travelled %s km",Vehicle.DECIMAL_FORMAT.format(km)));
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
        super.setFuel(fuel*0.95);
    }
}
