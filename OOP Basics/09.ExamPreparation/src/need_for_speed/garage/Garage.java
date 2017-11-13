package need_for_speed.garage;

import need_for_speed.cars.Car;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Garage {

    private List<Car> parkedCars;

   public Garage(){
        this.parkedCars = new LinkedList<>();
    }
    public void park(Car car){
       this.parkedCars.add(car);
    }
    public void unpark(Car car){
        this.parkedCars.remove(car);
    }

    public List<Car> getParkedCars(){
        return Collections.unmodifiableList(this.parkedCars);
    }
    public void tune(int tuneIndex, String addOn){
       this.parkedCars.forEach(x -> x.tune(tuneIndex, addOn));


    }
}
