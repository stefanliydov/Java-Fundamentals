package comparing_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);


        List<Person> people = new ArrayList<>();

        while(true){
            String[] line = scanner.nextLine().split("\\s+");
            if(line[0].equals("END")){
                break;
            }
            Person person = new Person(line[0],Integer.parseInt(line[1]),line[2]);
            people.add(person);
        }

        int personIndex = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int countOfEquals = 0;
        if(personIndex>=0 && personIndex< people.size()){
            Person mainPerson = people.get(personIndex);
            for (Person person:
                 people) {
                if(person.compareTo(mainPerson) ==0){
                    countOfEquals++;
                }
            }

        }
        System.out.println(countOfEquals ==0?"No matches" : String.format("%d %d %d",countOfEquals,people.size()-countOfEquals,people.size()));

    }
}
