import java.util.Scanner;

public class TransportPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double km = scanner.nextDouble();
        scanner.nextLine();
        String time = scanner.nextLine();
        double result = 0.0d;
        if(km<20){
            result = time.equals("day")? 0.70+(km*0.79):0.70+(km*0.90);
        }
        else if(km<100){
            result = 0.09*km;
        }
        else{
            result = km*0.06;
        }
        System.out.printf("%.2f",result);
    }
}
