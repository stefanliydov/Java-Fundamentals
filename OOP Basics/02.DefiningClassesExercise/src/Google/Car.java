package Google;

public class Car {

    private String model;
    private int speed;


    public Car(String model, int speed){
        this.model=model;
        this.speed=speed;
    }

    @Override
    public String toString() {
        if(this.model.equals("")){
            return "Car:\n";
        }
        return String.format("Car:\n%s %s",this.model,this.speed);
    }
}
