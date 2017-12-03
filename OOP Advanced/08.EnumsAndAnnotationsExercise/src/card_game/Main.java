package card_game;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(scanner.nextLine());
        Player player2 = new Player(scanner.nextLine());
        Deck deck = new Deck();

        while(player1.getHandSize() != 5){
            try{
                player1.addCardToDeck(deck.getCard(scanner.nextLine()));
            }catch(IllegalArgumentException err){
                System.out.println(err.getMessage());
            }
        }
        while(player2.getHandSize() != 5){
            try{
                player2.addCardToDeck(deck.getCard(scanner.nextLine()));
            }catch(IllegalArgumentException err){
                System.out.println(err.getMessage());
            }
        }
        int winner = Card.getBiggerCard(player1.getStrongestCard(),player2.getStrongestCard());
        if(winner == 1){
            System.out.println(String.format("%s wins with %s.",player1.getName(),player1.getStrongestCard().toString()));
        }else{
            System.out.println(String.format("%s wins with %s.",player2.getName(),player2.getStrongestCard().toString()));

        }

    }
}
