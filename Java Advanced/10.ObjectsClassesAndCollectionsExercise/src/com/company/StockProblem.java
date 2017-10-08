package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class StockProblem {
private static StringBuilder sb;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[]price = new int[n];
        for (int i = 0; i <n ; i++) {
            price[i] = Integer.parseInt(scanner.nextLine());
        }

        calculateSpan(price, n);
        System.out.println(sb.toString());
    }

    static void calculateSpan(int price[], int n)
    {
        System.out.println(1);

        int S=1;
        for (int i = 1; i < n; i++)
        {

            S=1;

            for (int j = i-1; (j>=0)&&(price[i]>=price[j]); j--) {
                S++;
            }
        sb.append(S+"\\n");
        }
    }
}
