package com.company;

import java.util.Scanner;

public class GameOfNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String winner = "";
        long points = Integer.MIN_VALUE;

        int count = scanner.nextInt();
        scanner.nextLine();

        for(int i=1;i<=count;i++){

            String player = scanner.nextLine();
            int score = scanner.nextInt();
            scanner.nextLine();
           for(int r=0;r<player.length();r++){
               int currNum = (int)player.charAt(r);
               if(currNum%2==0){
                   score+=currNum;
               }else{
                   score-=currNum;
               }
           }
           if(score>points){
               winner=player;
               points=score;
           }
        }
    System.out.printf("The winner is %s - %s points",winner,points);

    }
}
