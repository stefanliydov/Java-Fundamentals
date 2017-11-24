package generic_swap_method_string;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Box> boxes  = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            Box<Integer> box = new Box<>(Integer.parseInt(scanner.nextLine()));
           boxes.add(box);
        }
        int[] swapIndexes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Box temp = boxes.get(swapIndexes[0]);
        boxes.set(swapIndexes[0],boxes.get(swapIndexes[1]));
        boxes.set(swapIndexes[1],temp);

        for (Box box:
             boxes) {
            System.out.println(box.toString());
        }

    }
}
