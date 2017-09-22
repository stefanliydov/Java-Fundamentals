package com.company;

import java.util.Scanner;

public class FormattingNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        String result = "|";
        String first =convert(a);
        while (first.length() <10){
            first+=" ";
        }
        result+=first+"|";

        String second = Integer.toBinaryString(a);
        while(second.length() <10){
            second="0"+second;
        }
        result+=second+"|";

        String third = String.format("%.2f", b);
        while(third.length() <10){
            third=" "+third;
        }
        result +=third+"|";

        String fourth = String.format("%.3f",c);
        while (fourth.length()<10){
            fourth+=" ";
        }
        result+=fourth+"|";
        System.out.println(result);
    }
    public static String convert(int n) {
        return Integer.toHexString(n).toUpperCase();
    }

}
