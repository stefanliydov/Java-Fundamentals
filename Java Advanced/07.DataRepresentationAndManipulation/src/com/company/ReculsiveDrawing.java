package com.company;

        import java.util.Arrays;
        import java.util.Scanner;
        import java.util.Collections;
public class ReculsiveDrawing {
    private static int numberOfLoops;
    private static int[] loops;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         numberOfLoops = Integer.parseInt(scanner.nextLine());
         loops = new int[numberOfLoops];
        generateLoops(0);
    }
    private static void generateLoops(int curr){
        if(curr == numberOfLoops){
            draw();
            return;
        }
        for (int i = 1; i <= numberOfLoops; i++) {
            loops[curr] =i;
            generateLoops(curr+1);
        }
    }

    private static void draw() {
        System.out.println(Arrays.toString(loops).replaceAll("[\\[\\],]",""));
    }
}
