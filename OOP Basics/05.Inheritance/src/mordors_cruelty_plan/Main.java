package mordors_cruelty_plan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Gandalf gandalf  = new Gandalf();
        String[] foods = scanner.nextLine().split("\\s+");
        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            gandalf.eat(food);

        }
        System.out.println(gandalf.getMoodIndex());
        System.out.println(gandalf.getMood());

    }
}
