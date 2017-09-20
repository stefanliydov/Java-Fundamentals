import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secName = scanner.nextLine();

        if (firstName.isEmpty()){
            firstName ="*****";
        }
        if(secName.isEmpty()){
            secName = "*****";
        }

        System.out.printf("Hello, %s %s!",firstName,secName);
    }
}
