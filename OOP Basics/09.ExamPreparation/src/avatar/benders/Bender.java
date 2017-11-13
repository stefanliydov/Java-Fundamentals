package avatar.benders;

public abstract class Bender {

    private String name;
    private int power;

     Bender(String name, int power){
        this.name= name;
        this.power = power;
    }
    public abstract double totalPower();


     int getPower() {
        return this.power;
    }

     String getName() {
        return this.name;
    }
}
