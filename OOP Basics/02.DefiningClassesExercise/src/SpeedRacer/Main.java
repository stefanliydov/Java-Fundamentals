package SpeedRacer;



import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());

        LinkedHashMap <String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i <n ; i++) {
            String[] line = scanner.nextLine().split("\\s+");

            Car car = new Car(line[0],Double.parseDouble(line[1]),Double.parseDouble(line[2]));

            cars.putIfAbsent(line[0],car);
        }
        while(true){

            String[] line = scanner.nextLine().split("\\s+");

            if(line[0].equals("End")){
                break;
            }
            String model = line[1];
            int distance = Integer.parseInt(line[2]);
            try {
            cars.get(model).drive(distance);

            }catch (IllegalStateException ise){
                System.out.println(ise.getMessage());
            }
        }

        cars.values().forEach(System.out::println);
    }
}
