package vehicle;

import java.text.DecimalFormat;

abstract class Vehicle {

    private static final String FORMAT = "#.##";
    static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat(FORMAT);

     double getTankCapacity() {
        return this.tankCapacity;
    }

    private double tankCapacity;
    private double fuel;
    private double litersPerKm;

      Vehicle(double fuel, double litersPerKm,double tankCapacity) {
         this.fuel = fuel;
         this.litersPerKm = litersPerKm;
         this.tankCapacity = tankCapacity;
     }

     protected abstract void drive(double km);


    protected abstract void refuel(double fuel);

      double getFuel() {
         return this.fuel;
     }

      double getLitersPerKm() {
         return this.litersPerKm;
     }

      void setFuel(double fuel) {
         this.fuel += fuel;
     }

}
