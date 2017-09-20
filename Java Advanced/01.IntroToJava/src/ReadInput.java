import java.util.Scanner;

public class ReadInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.next("\\w+");
        String secWord = scanner.next("\\w+");
        int firstNum = scanner.nextInt();
        int secNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        scanner.nextLine();
        String thirdWord =scanner.nextLine();
        int sum = firstNum + secNum+ thirdNum;
        System.out.println(firstWord+ " "+ secWord+" "+thirdWord+" "+ sum);

    }
}
