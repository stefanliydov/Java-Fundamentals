package Google;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people = new HashMap<>();

        while(true){

            String[] line = scanner.nextLine().split("\\s+");

            if(line[0].equals("End")){
                break;
            }

            String personName = line[0];
            String subClass = line[1];
            people.putIfAbsent(personName,new Person(personName));
            switch (subClass){

                case "company":
                    Company company = new Company(line[2],line[3],Double.parseDouble(line[4]));
                    people.get(personName).setCompany(company);
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon(line[2],line[3]);
                    people.get(personName).addPokemon(pokemon);
                    break;
                case "parents":
                        Parent parent = new Parent(line[2],line[3]);
                        people.get(personName).addParent(parent);
                        break;
                case"children":
                    Child child =new Child(line[2],line[3]);
                    people.get(personName).addChild(child);
                        break;
                case "car":
                    Car car = new Car(line[2],Integer.parseInt(line[3]));

                    people.get(personName).setCar(car);
            }
        }
        String chosen = scanner.nextLine();

        Person person = people.get(chosen);
        System.out.println(person.toString());
    }
}
