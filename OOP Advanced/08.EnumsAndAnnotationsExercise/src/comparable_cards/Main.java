package comparable_cards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Card card = new Card(Rank.valueOf(scanner.nextLine()), Suit.valueOf(scanner.nextLine()));
        Card card2 = new Card(Rank.valueOf(scanner.nextLine()), Suit.valueOf(scanner.nextLine()));

        System.out.println(Card.getBiggerCard(card,card2).toString());
    }
}
