package RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Car> cars = new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            String model = line[0];
            int engineSpeed= Integer.parseInt(line[1]);
            int enginePower= Integer.parseInt(line[2]);
            int cargoWeigth= Integer.parseInt(line[3]);
            String cargoType = line[4];
            List<Tire> tires = new ArrayList<>();
            for (int j = 5; j <12 ; j+=2) {
                Tire newTire = new Tire(Double.parseDouble(line[j]),Integer.parseInt(line[j+1]));
                tires.add(newTire);
            }
            Engine engine = new Engine(engineSpeed,enginePower);
            Cargo cargo = new Cargo(cargoWeigth,cargoType);

            Car newCar = new Car(model,engine,cargo,tires);
            cars.putIfAbsent(model, newCar);
        }
        String type = scanner.nextLine();
        switch (type){
            case "fragile":
                cars.entrySet().stream()
                        .filter(x -> x.getValue().getCargoType().equals("fragile"))
                        .filter(x-> x.getValue().pressureCheck())
                        .forEach(x-> System.out.println(x.getKey()));
                break;
            case "flamable":
                cars.entrySet().stream()
                        .filter(x -> x.getValue().getCargoType().equals("flamable"))
                        .filter(x-> x.getValue().getEngine().getPower()>250)
                        .forEach(x -> System.out.println(x.getKey()));

                break;
        }
    }
}
