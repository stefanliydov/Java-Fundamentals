package telephony;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Smartphone smartphone = new Smartphone();

        String[] numbers = scanner.nextLine().split(" ");
        String[] urls = scanner.nextLine().split(" ");

        for (String number : numbers) {
            System.out.println(smartphone.call(number));
        }
        for (String url : urls) {
            System.out.println(smartphone.browse(url));
        }

    }
}
