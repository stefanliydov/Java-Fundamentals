package vehicle;

public class Bus extends Vehicle{
     Bus(double fuel, double litersPerKm,double tankCapacity) {
        super(fuel, litersPerKm,tankCapacity);
    }

    @Override
    protected void drive(double km) {
    }

     void drive(double km,String condition) {
        double fuel;
        if(!condition.equals("DriveEmpty")){
            fuel = (super.getLitersPerKm()+1.4)*km;
        }
        else
         fuel = super.getLitersPerKm()*km;

        if(fuel> super.getFuel()){
            throw new IllegalArgumentException("Bus needs refueling");
        }
        System.out.println(String.format("Bus travelled %s km",Vehicle.DECIMAL_FORMAT.format(km)));
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
