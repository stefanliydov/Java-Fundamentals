import java.math.BigDecimal;
import java.util.Scanner;

public class EuroTrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kg = Double.parseDouble(scanner.nextLine());
        double pricePerKilo = 1.20;
        BigDecimal priceInLv = new BigDecimal(kg*pricePerKilo);
        BigDecimal Wurst = new BigDecimal("4210500000000");
        BigDecimal priceWurst = priceInLv.multiply(Wurst);
        System.out.printf("%.2f marks",priceWurst);
    }
}
