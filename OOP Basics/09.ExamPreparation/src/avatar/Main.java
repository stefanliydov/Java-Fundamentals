package avatar;

import avatar.benders.*;
import avatar.monuments.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {


   private static Nation airNation;
   private static Nation waterNation;
   private static Nation fireNation;
   private static Nation earthNation;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

         airNation = new Nation("Air");
         waterNation = new Nation("Water");
         fireNation = new Nation("Fire");
         earthNation = new Nation("Earth");
        List<String> warIssued = new LinkedList<>();

        while(true){
            String[] line = bf.readLine().split("\\s+");

            if(line[0].equals("Quit"))
                break;

            switch (line[0]){
                case "Bender":
                    createBender(line[1],line[2],Integer.parseInt(line[3]), Double.parseDouble(line[4]));
                    break;
                case "Monument":
                    createMonument(line[1],line[2],Integer.parseInt(line[3]));
                    break;
                case "Status":
                    System.out.println(getStatus(line[1]));
                    break;
                case "War":
                    War();
                    warIssued.add(line[1]);
                    break;
            }
        }
        int count=1;
        for (String nation:
             warIssued) {
            System.out.println(String.format("War %s issued by %s",count,nation));
            count++;
        }
    }

    private static void createBender(String type,String name, int power,double bonus){

        switch (type){
            case"Air":
            airNation.addBender(new AirBender(name, power, bonus));
                break;
            case"Water":
                waterNation.addBender(new WaterBender(name, power,bonus));
                break;
            case"Fire":
                fireNation.addBender(new FireBender(name, power,bonus));
                break;
            case"Earth":
                earthNation.addBender(new EarthBender(name, power,bonus));
                break;
        }
    }

    private static void createMonument(String type, String name, int bonus){

        switch (type){
            case"Air":
                airNation.addMonument(new AirMonument(name,bonus));
                break;
            case"Water":
                waterNation.addMonument(new WaterMonument(name, bonus));
                break;
            case"Fire":
                fireNation.addMonument(new FireMonument(name, bonus));
                break;
            case"Earth":
                earthNation.addMonument(new EarthMonument(name, bonus));
                break;
        }
    }

    private static String getStatus(String type) {
        switch (type) {
            case "Air":
                return airNation.toString();
            case "Water":
                return waterNation.toString();
            case "Fire":
                return fireNation.toString();
            case "Earth":
                return earthNation.toString();
            default:
                return null;
        }
    }

    private static void War(){
        double airPower = airNation.totalPower();
        double waterPower = waterNation.totalPower();
        double firePower = fireNation.totalPower();
        double earthPower = earthNation.totalPower();

        if(airPower>waterPower && airPower>firePower && airPower>earthPower){
            waterNation.clearNation();
            fireNation.clearNation();
            earthNation.clearNation();
        }
        else if(waterPower> airPower && waterPower>firePower && waterPower>earthPower){
            airNation.clearNation();
            fireNation.clearNation();
            earthNation.clearNation();
        }else if(firePower>airPower && firePower>waterPower && firePower>earthPower){
            waterNation.clearNation();
            airNation.clearNation();
            earthNation.clearNation();
        }else if( earthPower>airPower && earthPower>waterPower && earthPower>firePower){
            waterNation.clearNation();
            fireNation.clearNation();
            airNation.clearNation();
        }

    }
}
