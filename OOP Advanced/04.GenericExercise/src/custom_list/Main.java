package custom_list;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> list = new CustomList<>();

        while(true){
            String[] line = scanner.nextLine().split(" ");

            if(line[0].equals("END")){
                break;
            }
            switch (line[0]){
                case "Add":
                    list.add(line[1]);
                    break;
                case "Remove":
                    System.out.println(list.remove(Integer.parseInt(line[1])));
                    break;
                case "Contains":
                    System.out.println(list.contains(line[1]));
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(line[1]),Integer.parseInt(line[2]));
                    break;
                case "Greater":
                    System.out.println(list.countGreaterThan(line[1]));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    for (String el:
                         list.getList()) {
                        System.out.println(el);
                    }
                    break;
            }
        }
    }
}
