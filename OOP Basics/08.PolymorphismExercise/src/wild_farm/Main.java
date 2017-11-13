package wild_farm;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new LinkedList<>();
        while(true){
            String[] line = scanner.nextLine().split("\\s+");
            if(line[0].equals("End")){
                break;
            }

            String[] foodTokens = scanner.nextLine().split("\\s+");

            Animal animal = createAnimal(line);
            assert animal != null;
            animal.makeSound();

            Food food = createFood(foodTokens);

            try {

                assert food != null;
                animal.eatFood(food,food.getQuantity());
            }catch (IllegalArgumentException err){
                System.out.println(err.getMessage());
            }

            animals.add(animal);
        }
      animals.forEach(System.out::println);
    }

    private static Food createFood(String[] s) {
        switch (s[0]){
            case"Vegetable":
                return new Vegetable(Integer.parseInt(s[1]));
            case "Meat":
                return new Vegetable(Integer.parseInt(s[1]));
                default:
                    return null;
        }
    }

    private static Animal createAnimal(String[] s) {
        switch (s[0]){
            case "Cat":
                return new Cat(s[1],s[0],Double.parseDouble(s[2]),0,s[3],s[4]);

            case "Tiger":
                return new Tiger(s[1],s[0],Double.parseDouble(s[2]),0,s[3]);
            case "Zebra":
                return new Zebra(s[1],s[0],Double.parseDouble(s[2]),0,s[3]);
            case "Mouse":
                return new Mouse(s[1],s[0],Double.parseDouble(s[2]),0,s[3]);
            default:
                return null;
        }
    }
}
