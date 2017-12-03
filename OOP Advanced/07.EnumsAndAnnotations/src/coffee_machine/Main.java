package coffee_machine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        while(true){
            String[] line = scanner.nextLine().split(" ");

            if(line[0].equals("END")){
                break;
            }
            switch (line.length){
                case 1:
                    Coin coin = Coin.valueOf(line[0]);
                    coffeeMachine.insertCoin(coin);
                    break;
                case 2:
                    Coffee coffee = new Coffee(CoffeeSize.valueOf(line[0].toUpperCase()),CoffeeType.valueOf(line[1].toUpperCase()));
                    coffeeMachine.buyCoffee(coffee);
                    break;
            }
        }
        for (Coffee coffee:
             coffeeMachine.coffeesSold()) {
            System.out.println(coffee);
        }
    }
}
