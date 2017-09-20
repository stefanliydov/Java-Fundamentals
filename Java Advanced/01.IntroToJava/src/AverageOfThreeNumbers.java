import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double firstNum = scanner.nextDouble();
        double secNum = scanner.nextDouble();
        double thirdNum = scanner.nextDouble();
        double average = (firstNum+secNum+thirdNum)/3;

        System.out.printf("%.2f", average);

    }
}
