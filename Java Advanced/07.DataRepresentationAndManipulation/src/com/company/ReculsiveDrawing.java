package com.company;

import java.util.Scanner;
import java.util.Collections;
public class ReculsiveDrawing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
draw(n);
    }
    private static void draw(int n){
        if(n ==0){
            return;
        }
        System.out.println(String.join("",Collections.nCopies(n,"*")));
        draw(n-1);
        System.out.println(String.join("",Collections.nCopies(n,"#")));
    }
}
