package com.company;

import java.util.Scanner;

public class CalculateExpression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a =scanner.nextDouble();
        double b =scanner.nextDouble();
        double c =scanner.nextDouble();
        scanner.close();

        double f1 =f1(a,b,c);
        double f2 =f2(a,b,c);
        double diff = diff(a,b,c,f1,f2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",f1,f2,diff);
    }
    private static double f1(double a, double b, double c){
        return Math.pow((a*a+b*b)/(a*a-b*b),(a+b+c)/Math.sqrt(c));

    }
    private static double f2(double a, double b, double c){
        return Math.pow((a*a+b*b-c*c*c),(a-b));
    }
    private static double diff(double a, double b, double c, double f1, double f2){
        return Math.abs((a+b+c)/3 - (f1+f2)/2);
    }
}
