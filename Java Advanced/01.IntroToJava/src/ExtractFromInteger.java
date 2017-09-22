import java.util.Scanner;

public class ExtractFromInteger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int p = scanner.nextInt();

        int shift = n >> p;
        int bit =shift &1;
        System.out.println(bit);
    }
}
