package need_for_speed.races;

import need_for_speed.cars.Car;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class DragRace extends Race {

    public DragRace(int length, String route, int prizePool) {
        super(length, route, prizePool);
    }
    @Override
    public HashMap<Integer, Car> getWinners() {
        HashMap<Integer,Car> winners = new LinkedHashMap<>();
        this.getParticipants().stream().sorted((x,y)-> Integer.compare(calculatePP(y),calculatePP(x))).limit(3)
                .forEach(c -> winners.put(calculatePP(c),c));
        return winners;
    }

    private int calculatePP(Car car){
        return (car.getHorsePower() / car.getAcceleration());
    }
}
