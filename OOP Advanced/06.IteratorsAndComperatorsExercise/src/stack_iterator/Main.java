package stack_iterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        while(true){
            String[] line = scanner.nextLine().split("[,\\s]+");

            if(line[0].equals("END")){
                break;
            }
            switch (line[0]) {
                case "Push":
                    String[] arr = new String[line.length - 1];
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = line[i + 1];
                    }
                    stack.Push(arr);
                    break;
                case "Pop":
                    try {
                        stack.Pop();
                    }catch (IllegalArgumentException err){
                        System.out.println(err.getMessage());
                    }
            }
        }
        for (Integer inter:
             stack) {
            System.out.println(inter);
        }
        for (Integer inter:
                stack) {
            System.out.println(inter);
        }
    }
}
