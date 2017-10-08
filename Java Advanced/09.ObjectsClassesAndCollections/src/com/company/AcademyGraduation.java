package com.company;




import java.util.Arrays;

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class AcademyGraduation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
            double sum = DoubleStream.of(grades).sum()/grades.length;

            System.out.println(String.format("%s is graduated with %s",name,fmt(sum)));
        }
    }
    private static String fmt(double d)
    {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }
}



