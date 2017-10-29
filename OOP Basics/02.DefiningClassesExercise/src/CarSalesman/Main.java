package CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Engine> engines = new HashMap<>();
        getEngines(engines, br);

        List<Car> cars = new LinkedList<>();
        getCars(cars, engines, br);

        printCars(cars);
    }

    private static void printCars(List<Car> cars) {
        cars.forEach(System.out::println);
    }

    private static void getCars(List<Car> cars, Map<String, Engine> engines, BufferedReader br) throws  IOException{
        int carsCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < carsCount; i++) {
            String[] carInfo = br.readLine().split(" ");
            String model = carInfo[0];
            String engineModel = carInfo[1];
            Engine engine = engines.get(engineModel);

            switch (carInfo.length){
                case 2:
                    cars.add(new Car(model, engine));
                    break;
                case 3:
                    try{
                        int weight = Integer.parseInt(carInfo[2]);
                        cars.add(new Car(model, engine, weight));
                    } catch (Exception e) {
                        String color = carInfo[2];
                        cars.add(new Car(model, engine, color));
                    }
                    break;
                case 4:
                    int weight = Integer.parseInt(carInfo[2]);
                    String color = carInfo[3];
                    cars.add(new Car(model, engine, weight, color));
            }
        }
    }

    private static void getEngines(Map<String, Engine> engines, BufferedReader br) throws IOException{
        int enginesCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < enginesCount; i++) {
            String[] engineInfo = br.readLine().split(" ");
            String model = engineInfo[0];
            int power = Integer.parseInt(engineInfo[1]);

            switch (engineInfo.length){
                case 2:
                    engines.putIfAbsent(model, new Engine(model, power));
                    break;
                case 3:
                    try{
                        int displacements = Integer.parseInt(engineInfo[2]);
                        engines.putIfAbsent(model, new Engine(model, power, displacements));
                    } catch (Exception e) {
                        String efficiency = engineInfo[2];
                        engines.putIfAbsent(model, new Engine(model, power, efficiency));
                    }
                    break;
                case 4:
                    int displacements = Integer.parseInt(engineInfo[2]);
                    String efficiency = engineInfo[3];
                    engines.putIfAbsent(model, new Engine(model, power, displacements, efficiency));
            }
        }
    }
}
