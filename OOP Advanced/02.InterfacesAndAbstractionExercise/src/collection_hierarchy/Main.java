package collection_hierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IAddCollection addCollection = new AddCollection();
        IAddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        IMyList myList = new MyList();
        String[] items = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        for (String item : items) {
            System.out.print(addCollection.add(item)+ " ");
        }
        System.out.println();
        for (String item : items) {
            System.out.print(addRemoveCollection.add(item)+ " ");
        }
        System.out.println();
        for (String item : items) {
            System.out.print(myList.add(item)+ " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(addRemoveCollection.remove()+ " ");
        }
        System.out.println();
        for (int i = 0; i <n ; i++) {
            System.out.print(myList.remove()+ " ");
        }
    }
}
