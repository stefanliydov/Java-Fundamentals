package com.company;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.nextLine();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        scanner.nextLine();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        scanner.close();
        System.out.println(FindArea(x,y,x1,y1,x2,y2));
    }
    public static double FindArea(int x, int y, int x1, int y1, int x2, int y2){
        double area = Math.abs((x*(y1-y2)+x1*(y-y2)+x2*(y1-y))/2);
        if(x==y && x1==y1 && x2==y2)
            return 0;

        return Math.round(area);
    }
}

