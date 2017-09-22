package com.company;

import java.util.Scanner;

    public class CalculateTriangleAreaMethod {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            double base  =scanner.nextDouble();
            double height = scanner.nextDouble();
            scanner.nextLine();
            System.out.printf("Area = %.2f",calculateTriangleArea(base, height));
        }
        private static double calculateTriangleArea(double b, double h){
            return (b*h)/2;
        }
    }
