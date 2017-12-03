package traffic_light;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");
        TrafficLight[] lights = new TrafficLight[values.length];
        for (int i = 0; i < lights.length; i++) {
            lights[i] = TrafficLight.valueOf(values[i]);
            
        }
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <lights.length ; j++) {
            lights[j] = lights[j].next();
                System.out.print(lights[j]+" ");
            }
            System.out.println();
        }

    }
}
