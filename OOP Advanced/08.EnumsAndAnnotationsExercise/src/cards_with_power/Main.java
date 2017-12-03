package cards_with_power;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Card card = new Card(Rank.valueOf(scanner.nextLine()),Suit.valueOf(scanner.nextLine()));
        System.out.println(card.toString());
    }
}
