package Linked_List_Traversal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedListTraversal list = new LinkedListTraversal();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String[] line = scanner.nextLine().split(" ");

            switch (line[0]){
                case "Add":
                        list.add(Integer.parseInt(line[1]));
                    break;
                case "Remove":
                    list.remove(Integer.parseInt(line[1]));
                    break;
            }
        }
        System.out.println(list.getSize());
        for (int num:
             list) {
            System.out.print(num+" ");
        }
    }
}
