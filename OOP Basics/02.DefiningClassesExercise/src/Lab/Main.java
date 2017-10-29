package Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String[] line = scanner.nextLine().split(" ");
            Person newPerson = new Person();
            newPerson.Person(line[0],Integer.parseInt(line[1]));
            people.add(newPerson);
        }
        people.stream().filter(x -> x.getAge()>30)
                .sorted((x,y)->x.getName().compareTo(y.getName()))
                .forEach(x-> System.out.println(String.format("%s - %s",x.getName(),x.getAge())));

        LinkedHashMap<String, Integer> test = new LinkedHashMap<>();

    }

}
