package com.company;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class addVAT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr =scanner.nextLine().split(", ");

        Function<String, Double> addVat = x-> Double.parseDouble(x)*1.20;
        System.out.println("Prices with VAT:");
        for (String s : arr) {

            System.out.println(String.format("%.2f",addVat.apply(s)).replaceAll("\\.",","));
        }
    }
}
