package food_shortage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Individual> individuals = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        int food = 0;
        for (int i = 0; i <n ; i++) {
            String[] line = scanner.nextLine().split(" ");
            switch (line.length){
                case 4:
                    individuals.put(line[0],new Citizen());
                    break;
                case 3:
                    individuals.put(line[0],new Rebel());
                    break;
            }

        }
        while(true){

            String line = scanner.nextLine();
            if(line.equals("End")){
                break;
            }
            if(individuals.containsKey(line)) {
                switch (individuals.get(line).getClass().getSimpleName()) {
                    case "Rebel":
                        food+=5;
                        break;
                    case "Citizen":
                      food+=10;
                        break;
                }
            }
        }
        System.out.println(food);
    }
}
