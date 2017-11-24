package strategy_pattern;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Person> byNameComp = new TreeSet<>(new CompareByName());
        Set<Person> byAgeComp = new TreeSet<>(new CompareByAge());


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String[] line = scanner.nextLine().split(" ");
            Person person= new Person(line[0],Integer.parseInt(line[1])) ;
            byNameComp.add(person);
            byAgeComp.add(person);
        }
        byNameComp.forEach(System.out::println);
        byAgeComp.forEach(System.out::println);
    }
}
