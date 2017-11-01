package PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstLine= scanner.nextLine().split("\\s+");
        String[] secondLine = scanner.nextLine().split("\\s+");
        try {
            if (!firstLine[0].equals("Pizza")) {
                throw new IllegalStateException("Invalid type of dough.");
            }

           String name = firstLine[1];
            int toppingXtimes = Integer.parseInt(firstLine[2]);
            Pizza pizza = new Pizza(name, toppingXtimes);

            Dough dough = new Dough(secondLine[1], secondLine[2], Integer.parseInt(secondLine[3]));

            pizza.setDough(dough);
            while (true) {
                String[] topping = scanner.nextLine().split("\\s+");

                if (topping[0].equalsIgnoreCase("end")) {
                    break;
                }

                String type = topping[1];
                int weight = Integer.parseInt(topping[2]);
                Topping newTopping = new Topping(type, weight);
                pizza.addTopping(newTopping);
            }
            System.out.println(pizza.toString());


        }
        catch(IllegalStateException err){
            System.out.println(err.getMessage());
        }

    }
}
