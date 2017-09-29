package com.company;

import java.util.Scanner;

public class CollectTheCoins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] board = new String[4];

        board[0] = scanner.nextLine();
        board[1] = scanner.nextLine();
        board[2] = scanner.nextLine();
        board[3] = scanner.nextLine();

        char[] moves = scanner.nextLine().toCharArray();
        scanner.close();

        //Declaring counter and position
        int coins = 0;
        int wallsHit = 0;
        int leftRightPos= 0;
        int upDownPos = 0;

        for (int i = 0; i < moves.length; i++) {
            char move = moves[i];

            switch (move){
                //Up&DownMovement
                case '^':
                    upDownPos--;
                    if(upDownPos<0){
                        upDownPos++;
                        wallsHit++;
                    }
                    else if(leftRightPos>=board[upDownPos].length()){
                        upDownPos++;
                        wallsHit++;
                    } else {
                        if(board[upDownPos].charAt(leftRightPos) == '$'){
                            coins++;
                        }
                    }
                    break;
                case 'V':
                    upDownPos++;
                    if(upDownPos>3){
                        upDownPos--;
                        wallsHit++;
                    }
                   else if(leftRightPos>=board[upDownPos].length()){
                        upDownPos--;
                        wallsHit++;
                    } else {
                        if(board[upDownPos].charAt(leftRightPos) =='$'){
                            coins++;
                        }
                    }
                    break;

                    //Lef&tRightMovement
                case '>':
                    leftRightPos++;
                    if(leftRightPos >= board[upDownPos].length()){
                        leftRightPos--;
                        wallsHit++;
                    }else {
                        if(board[upDownPos].charAt(leftRightPos) =='$'){
                            coins++;
                        }
                    }
                    break;
                case '<':
                    leftRightPos--;
                    if(leftRightPos<0){
                        leftRightPos++;
                        wallsHit++;
                    }else {
                        if(board[upDownPos].charAt(leftRightPos) == '$'){
                            coins++;
                        }
                    }
                    break;

            }

        }
        System.out.printf("Coins = %s",coins);
        System.out.println();
        System.out.printf("Walls = %s",wallsHit);
    }
}
