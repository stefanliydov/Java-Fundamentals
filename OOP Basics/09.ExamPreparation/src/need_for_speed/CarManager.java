package need_for_speed;

import need_for_speed.cars.Car;
import need_for_speed.cars.PerformanceCar;
import need_for_speed.cars.ShowCar;
import need_for_speed.garage.Garage;
import need_for_speed.races.CasualRace;
import need_for_speed.races.DragRace;
import need_for_speed.races.DriftRace;
import need_for_speed.races.Race;

import java.util.HashMap;
import java.util.LinkedHashMap;


 class CarManager {

   private HashMap<Integer, Car> cars = new LinkedHashMap<>();
   private HashMap<Integer, Race> races = new LinkedHashMap<>();
   private Garage garage = new Garage();

   public void register(int id, String type, String brand, String model,
                  int yearOfProduction, int horsepower, int acceleration, int suspension, int durability){
        //CREATE NEW TYPE CAR
        Car car = null;
        switch (type){
            case "Performance":
                car = new PerformanceCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
                break;
            case"Show":
                car = new ShowCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
                break;
       }
        this.cars.putIfAbsent(id, car);

    }

     public String check(int id){
        if(cars.containsKey(id)){
            return cars.get(id).toString();
        }
        return null ;
    }

     public void open(int id, String type, int length, String route, int prizePool){

        Race race = null;

        switch (type){
            case "Casual":
                race = new CasualRace(length, route, prizePool);
                break;
            case "Drag":
                race = new DragRace(length, route, prizePool);
                break;
            case "Drift":
                race = new DriftRace(length, route, prizePool);
                break;
        }
        races.putIfAbsent(id, race);
    }

     public void participate(int carId, int raceId){
        if(this.cars.containsKey(carId) && this.races.containsKey(raceId) && !garage.getParkedCars().contains(this.cars.get(carId))) {
            this.races.get(raceId).addParticipant(cars.get(carId));
        }
    }

     public String start(int id){
        if(this.races.containsKey(id) && this.races.get(id).getParticipants().size()!=0) {
            return this.races.remove(id).toString();
        }
        return "Cannot start the race with zero participants.";
    }

     public void park(int id){
        if(cars.containsKey(id) ) {

            Car car = this.cars.get(id);
            long count = this.races.values().stream().filter(x -> x.getParticipants().contains(car)).count();
            if (count == 0) {
                garage.park(cars.get(id));
            }
        }
    }

     public void unpark(int id){
        if(this.cars.containsKey(id) &&this.garage.getParkedCars().contains(this.cars.get(id)))
        this.garage.unpark(cars.get(id));
    }

     public void tune(int tuneIndex, String addOn){
        if(this.garage.getParkedCars().size()!=0) {
            this.garage.tune(tuneIndex, addOn);
        }

    }
}
