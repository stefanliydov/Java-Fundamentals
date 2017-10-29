package RawData;

import java.util.List;

public class Car {

    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;

    public Car (String model,Engine engine, Cargo cargo, List<Tire> tires){
        this.model= model;
        this.engine=engine;
        this.cargo =cargo;
        this.tires = tires;
    }
    public String getCargoType(){
       return this.cargo.getType();
    }
    public boolean pressureCheck(){

        for (Tire tire:
             this.tires) {
            if(tire.getPressure()<1){
                return true;
            }
        }
        return false;
    }

    public Engine getEngine() {
        return engine;
    }
}
