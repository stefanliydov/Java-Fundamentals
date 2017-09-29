package com.company;

import java.util.Scanner;

public class StudentsResults {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String dash = scanner.next();
        String[] grades= scanner.nextLine().split(", ");

        Double d0 = Double.parseDouble(grades[0]);
        Double d1 = Double.parseDouble(grades[1]);
        Double d2 = Double.parseDouble(grades[2]);
        System.out.println(String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|", "Name","JAdv","JavaOOP","AdvOOP","Average"));
        double average = (d0+d1+d2)/3;
        System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f",name, d0,d1,d2,average));
    }
}
