package generic_count_Method_string;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Box> boxes  = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            Box<Double> box = new Box<>(Double.parseDouble(scanner.nextLine()));
           boxes.add(box);
        }

        Box<Double> baseBox = new Box<>(Double.parseDouble(scanner.nextLine()));
        int count = 0;
        for (Box box:
             boxes) {
            count+=Box.compare(baseBox,box);
        }
        System.out.println(count);
    }
}
