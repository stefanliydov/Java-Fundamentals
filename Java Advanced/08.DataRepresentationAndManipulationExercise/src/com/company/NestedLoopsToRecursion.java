package com.company;

import java.util.Scanner;
import java.util.Collections;
public class NestedLoopsToRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
print(1);
    }
    private static void print(int n){
        if(n == 5){
            return;
        }
        System.out.print(String.join(" ",Collections.nCopies(n,"*")));
        print(n+1);
        System.out.print(String.join(" ",Collections.nCopies(n,"#")));
        System.out.println();
    }
}
