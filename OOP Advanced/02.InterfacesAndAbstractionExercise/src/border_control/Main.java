package border_control;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;
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
            switch (line.length){
                case 2:
                    individuals.put(line[1],new Robot(line[0],line[1]));
                    break;
                case 3:
                    individuals.put(line[2],new Citizen(line[0],Integer.parseInt(line[1]),line[2]));
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
