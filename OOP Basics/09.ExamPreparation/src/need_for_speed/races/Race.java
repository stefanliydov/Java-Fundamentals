package need_for_speed.races;

import need_for_speed.cars.Car;

import java.util.*;

public abstract class Race {


    private int length;
    private String route;
    private int prizePool;
    private List<Car> participants;

    protected Race(int length, String route, int prizePool) {
        this.length = length;
        this.route = route;
        this.prizePool = prizePool;
        this.participants = new LinkedList<>();
    }

    public void addParticipant(Car car){
         this.participants.add(car);
    }
    public List<Car> getParticipants(){
        return Collections.unmodifiableList(this.participants);
    }

    public abstract HashMap<Integer, Car> getWinners();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s - %s",this.route,this.length));
        int count=1;

        for (Map.Entry<Integer, Car> car
                :this.getWinners().entrySet()) {

        int price = getPrice(count);

            sb.append(String.format("\n%s. %s %s %dPP - $%d",count,car.getValue().getBrand(),car.getValue().getModel(),car.getKey(),price));
            count++;
        }
        return sb.toString();
    }

    private int getPrice(int count) {
        int price=0;
        switch (count){
            case 1:
                price = ((this.prizePool*50)/100);
                break;
            case 2:
                price = ((this.prizePool*30)/100);
                break;
            case 3:
                price = ((this.prizePool*20)/100);
                break;
        }
        return price;
    }
}
