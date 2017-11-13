package paw_inc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        AnimalCenterManager manager = new AnimalCenterManager();

        while(true){
            String[] line = bf.readLine().split(" \\| ");
            if(line[0].equals("Paw Paw Pawah")){
                break;
            }

            switch (line[0]){
                case "RegisterAdoptionCenter":
                    manager.registerAdoptionCenter(line[1]);
                    break;
                case "RegisterCleansingCenter":
                    manager.registerCleansingCenter(line[1]);
                    break;
                case "RegisterDog":
                    manager.registerDog(line[1],Integer.parseInt(line[2]),Integer.parseInt(line[3]),line[4]);
                    break;
                case "RegisterCat":
                    manager.registerCat(line[1],Integer.parseInt(line[2]),Integer.parseInt(line[3]),line[4]);
                    break;
                case "SendForCleansing":
                    manager.sendForCleansing(line[1],line[2]);
                    break;
                case "Cleanse":
                    manager.cleanse(line[1]);
                    break;
                case "Adopt":
                    manager.adopt(line[1]);
                    break;
            }
        }
        manager.printStatistics();
    }
}
