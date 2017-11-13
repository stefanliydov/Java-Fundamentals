package vehicle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(line[1]),Double.parseDouble(line[2]),Double.parseDouble(line[3]));

        line = scanner.nextLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(line[1]),Double.parseDouble(line[2]),Double.parseDouble(line[3]));

        line = scanner.nextLine().split("\\s+");
        Bus bus = new Bus(Double.parseDouble(line[1]),Double.parseDouble(line[2]),Double.parseDouble(line[3]));

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++)  {
            line = scanner.nextLine().split("\\s");

            switch (line[0]){
                case "DriveEmpty":
                case "Drive":
                    switch (line[1]) {
                        case "Car":
                            try {
                            car.drive(Double.parseDouble(line[2]));
                            }catch (IllegalArgumentException err){
                                System.out.println(err.getMessage());
                            }
                            break;
                        case "Truck":
                            try{
                            truck.drive(Double.parseDouble(line[2]));

                            }catch (IllegalArgumentException err){
                                System.out.println(err.getMessage());
                            }
                            break;
                        case "Bus":
                            try{
                                bus.drive(Double.parseDouble(line[2]),line[0]);

                            }catch (IllegalArgumentException err){
                                System.out.println(err.getMessage());
                            }
                            break;
                    }
                    break;
                case "Refuel":
                    try {
                        switch (line[1]) {
                            case "Car":
                                car.refuel(Double.parseDouble(line[2]));
                                break;
                            case "Truck":
                                truck.refuel(Double.parseDouble(line[2]));
                                break;
                            case "Bus":
                                bus.refuel(Double.parseDouble(line[2]));
                        }
                        break;
                    }catch (IllegalArgumentException err){
                        System.out.println(err.getMessage());
                    }
            }
        }
            System.out.println(String.format("Car: %.2f",car.getFuel()));
            System.out.println(String.format("Truck: %.2f",truck.getFuel()));
            System.out.println(String.format("Bus: %.2f",bus.getFuel()));
    }
}
