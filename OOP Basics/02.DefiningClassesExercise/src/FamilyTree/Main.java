package FamilyTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SuppressWarnings("Duplicates")
public class Main { // todo: needs more work
    private static List<Person> peopleList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Person thePerson = getNewPerson(br.readLine());

        getPeople(br);

        printPersonTies(thePerson);
    }

    private static void printPersonTies(Person person) {
        System.out.println(person);
        System.out.println("Parents:");
        person.getParents().forEach(System.out::println);
        System.out.println("Children:");
        person.getChildren().forEach(System.out::println);
    }

    private static void getPeople(BufferedReader br) throws IOException {
        String line = br.readLine();
        while (!line.equals("End")) {
            String[] familyInfo = line.split(" - ");
            if (familyInfo.length == 2) {
                Person parent = getNewPerson(familyInfo[0]);
                Person child = getNewPerson(familyInfo[1]);

                parent.addChild(child);
                child.addParent(parent);
            }
            else {
                completePerson(line);
            }

            line = br.readLine();
        }
    }

    private static void completePerson(String line) {
        String[] personInfo = line.split(" ");
        String firstName = personInfo[0];
        String lastName = personInfo[1];
        String birthday = personInfo[2];

        boolean isFound = false;
        Person completePerson = null;
        for (Person person : peopleList) {
            boolean isMatch = (person.getBirthday().equals(birthday)) ||
                    (person.getFirstName().equals(firstName) && person.getLastName().equals(lastName));

            if (isMatch) {
                if (!isFound) {

                    completePerson = person.completeAPerson(firstName, lastName, birthday);
                    isFound = true;
                    continue;
                }
                else {
                    trimAndFixTies(completePerson, person);
                    return;
                }
            }
        }
    }

    private static void trimAndFixTies(Person completePerson, Person incompletePerson) {
        for (Person parent : incompletePerson.getParents()) {
            completePerson.addParent(parent);
        }

        for (Person child : incompletePerson.getChildren()) {
            completePerson.addChild(child);
        }

        for (Person child : completePerson.getParents()) {
            if (child.getParents().contains(incompletePerson)){
                child.getParents().set(child.getParents().indexOf(incompletePerson), completePerson);
            }
        }

        for (Person person : peopleList) {
            if (person.getChildren().contains(incompletePerson) && !person.getChildren().contains(completePerson)){
                int index = person.getChildren().indexOf(incompletePerson);
                person.getChildren().set(index, completePerson);
            }
        }

        peopleList.remove(incompletePerson);
    }

    private static Person getNewPerson(String input) {
        if (input.contains("/")) {
            for (Person person : peopleList) {
                if (person.getBirthday().equals(input)){
                    return person;
                }
            }

            Person person = new Person(input);
            peopleList.add(person);
            return person;
        }
        String firstName = input.split(" ")[0];
        String lastName = input.split(" ")[1];

        for (Person person : peopleList) {
            if (person.getFirstName().equals(firstName) &&
                    person.getLastName().equals(lastName)){
                return person;
            }
        }

        Person person = new Person(firstName, lastName);
        peopleList.add(person);

        return person;
    }
}


