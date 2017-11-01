package ShoppingSpree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Person> people = new LinkedHashMap<>();
        HashMap<String, Product> products = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        String[] peopleTokens = scanner.nextLine().split(";");
        String[] productsTokens = scanner.nextLine().split(";");
        try {
            for (int i = 0; i < peopleTokens.length; i++) {
                String peopleToken[] = peopleTokens[i].split("=");
                String name = peopleToken[0];
                int money = Integer.parseInt(peopleToken[1]);
                Person person = new Person();
                    person.setName(name);
                    person.setMoney(money);
                    people.putIfAbsent(name, person);

            }

            for (int i = 0; i < productsTokens.length; i++) {
                String[] productsToken = productsTokens[i].split("=");
                String name = productsToken[0];
                int cost = Integer.parseInt(productsToken[1]);
                Product product = new Product();
                    product.setName(name);
                    product.setCost(cost);
                    products.putIfAbsent(name, product);

            }

            while (true) {
                String[] line = scanner.nextLine().split(" ");
                if (line[0].equals("END")) {
                    break;
                }
                String name = line[0];
                String productsName = line[1];

                    Person customer = people.get(name);
                    Product product = products.get(productsName);
                        customer.Buy(product.getCost(), product);



            }
            for (Person person :
                    people.values()) {
                System.out.println(person.toString());
            }
        }catch (IllegalArgumentException err){
            System.out.println(err.getMessage());
        }
    }
}
