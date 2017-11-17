package birthday_celebrations;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Individual> individuals = new LinkedHashMap<>();

        while(true){

            String[] line = scanner.nextLine().split(" ");
            if(line[0].equals("End")){
                break;
            }
            switch (line[0]){
                case "Pet":
                    individuals.put(line[2],new Pet(line[1],line[2]));
                    break;
                case "Citizen":
                    individuals.put(line[4],new Citizen(line[1],Integer.parseInt(line[2]),line[3], line[4]));
                    break;
            }
        }
        String faker = scanner.nextLine()+"\\b";
        Pattern pattern = Pattern.compile(faker);
        for (String id:
             individuals.keySet()) {
            if(pattern.matcher(id).find()){
                System.out.println(id);
            }
        }
    }
}
