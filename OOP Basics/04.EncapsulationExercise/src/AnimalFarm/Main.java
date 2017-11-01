package AnimalFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        Chicken chicken = new Chicken();

        try{
            chicken.setName(name);
            chicken.setAge(age);
            chicken.productPerDay();
        }catch (IllegalArgumentException err){
            System.out.println(err.getMessage());
        }

    }
}
