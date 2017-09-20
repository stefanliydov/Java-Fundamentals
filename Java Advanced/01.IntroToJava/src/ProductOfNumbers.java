import java.math.BigInteger;
import java.util.Scanner;

public class ProductOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger result = BigInteger.valueOf(1);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for(int i = start; i<=end;i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("product[%s..%s] = %s",start, end, result);
    }
}
