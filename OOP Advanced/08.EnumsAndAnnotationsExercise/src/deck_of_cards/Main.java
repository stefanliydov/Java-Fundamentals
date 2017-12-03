package deck_of_cards;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        Object[] suitValues = Suit.class.getEnumConstants();
        Object[] rankValues = Rank.class.getEnumConstants();

        for (Object suitValue : suitValues) {
            for (Object rankValue:
                 rankValues) {
                System.out.println(String.format("%s of %s",rankValue,suitValue));
            }
        }

    }
}
