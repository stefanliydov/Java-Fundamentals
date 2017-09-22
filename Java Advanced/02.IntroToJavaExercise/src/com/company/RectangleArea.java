package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal num1 = scanner.nextBigDecimal();
        BigDecimal num2 = scanner.nextBigDecimal();
        BigDecimal sum = num1.multiply(num2);

        System.out.printf("%.2f",sum);
    }
}
