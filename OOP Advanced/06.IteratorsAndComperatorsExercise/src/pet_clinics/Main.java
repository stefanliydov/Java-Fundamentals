package pet_clinics;

import java.util.HashMap;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            HashMap<String, Clinic<Room>> clinics = new HashMap<>();
            HashMap<String, Pet> pets = new HashMap<>();

        int count = Integer.parseInt(scanner.nextLine());

        while(count-- > 0){
            String[] line = scanner.nextLine().split("\\s+");

            switch (line[0]){
                case "Create":
                    create(clinics, pets, line);
                    break;
                case "Add":
                    addPet(clinics, pets, line);
                    break;
                case "Release":
                    if(clinics.containsKey(line[1])){
                        System.out.println(clinics.get(line[1]).releasePet());
                    }
                    break;
                case "HasEmptyRooms":
                    if(clinics.containsKey(line[1])){
                        System.out.println(clinics.get(line[1]).hasEmptyRooms());
                    }
                    break;
                case "Print":

                    if(clinics.containsKey(line[1])) {
                        if (line.length == 2) {
                            System.out.println(clinics.get(line[1]));
                        } else {
                            System.out.println(clinics.get(line[1]).getRoom(Integer.parseInt(line[2])));
                        }
                    }
                    break;

            }
        }
    }

    private static void create(HashMap<String, Clinic<Room>> clinics, HashMap<String, Pet> pets, String[] line) {
        switch (line[1]){
            case "Pet":
                Pet pet = new PetImpl(line[2],Integer.parseInt(line[3]),line[4]);
                pets.putIfAbsent(line[2],pet);
                break;
            case "Clinic":
                try {
                    Clinic<Room> clinic = new ClinicImpl(line[2], Integer.parseInt(line[3]));
                clinics.putIfAbsent(line[2],clinic);
                }catch (IllegalArgumentException err){
                    System.out.println(err.getMessage());
                }
                break;
        }
    }

    private static void addPet(HashMap<String, Clinic<Room>> clinics, HashMap<String, Pet> pets, String[] line) {
        if (pets.containsKey(line[1])){
            if(clinics.containsKey(line[2])){
                Pet pet = pets.get(line[1]);
                Clinic<Room> clinic = clinics.get(line[2]);
                System.out.println(clinic.addPet(pet));
            }
        }else{
            System.out.println("Invalid Operations!");
        }
    }
}
