package mankind;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            String[] studentTokens = scanner.nextLine().split("\\s+");
            String[] workerTokens = scanner.nextLine().split("\\s+");

            Human student = new Student(studentTokens[0],studentTokens[1],studentTokens[2]);
            Human worker = new Worker(workerTokens[0],workerTokens[1],Double.parseDouble(workerTokens[2]),Double.parseDouble(workerTokens[3]));
            System.out.println(student.toString());
            System.out.println(worker.toString());

        }catch (IllegalArgumentException err){
            System.out.println(err.getMessage());
        }

    }
}
