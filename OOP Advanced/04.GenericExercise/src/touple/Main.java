package touple;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        Touple<String, String> touple1 = new Touple<>(line[0]+" "+line[1],line[2]);

        line = scanner.nextLine().split(" ");
        Touple<String, Integer> touple2 = new Touple<>(line[0],Integer.parseInt(line[1]));

        line = scanner.nextLine().split(" ");
        Touple<Integer,Double> touple3 = new Touple<>(Integer.parseInt(line[0]),Double.parseDouble(line[1]));
        System.out.println(touple1);
        System.out.println(touple2);
        System.out.println(touple3);
    }
}
