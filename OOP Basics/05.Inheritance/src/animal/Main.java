package animal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        while(true){

            String type = scanner.nextLine();
            if(type.equalsIgnoreCase("Beast!")){
                break;
            }
            String[] line = scanner.nextLine().split("\\s+");

            try {
            Animal animal = getAnimal(type, line);
            if(animal==null){
                System.out.println(ErrorMessagesConstant.ERROR_MESSAGE);
            }else{
                System.out.println(animal.toString());
            }
            }catch (IllegalArgumentException err){
                System.out.println(err.getMessage());
            }

        }
    }

    private static Animal getAnimal(String type, String[] line) {

        switch (type){
            case "Animal":
                return new Animal(line[0],Integer.parseInt(line[1]), line[2]);
            case "Dog":
                return new Dog(line[0],Integer.parseInt(line[1]), line[2]);
            case "Cat":
                return new Cat(line[0],Integer.parseInt(line[1]), line[2]);
            case "Frog":
                return new Frog(line[0],Integer.parseInt(line[1]), line[2]);
            case "Kitten":
                return new Kitten(line[0],Integer.parseInt(line[1]), line[2]);
            case "Tomcat":
                return new Tomcat(line[0],Integer.parseInt(line[1]), line[2]);
                default:
                    return null;
        }
    }
}
