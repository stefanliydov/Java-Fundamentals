package DefiningClasses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Class personClass = Person.class;

        Constructor emptyConstructor = personClass.getDeclaredConstructor();
        Constructor ageConstructor = personClass.getDeclaredConstructor(int.class);
        Constructor nameAgeConstructor = personClass.getDeclaredConstructor(String.class, int.class);

        String name = br.readLine();
        int age = Integer.parseInt(br.readLine());

        Person basePerson = (Person) emptyConstructor.newInstance();
        Person personWithAge = (Person) ageConstructor.newInstance(age);
        Person personFull = (Person) nameAgeConstructor.newInstance(name, age);

        System.out.println(
                String.format("%s %s", basePerson.getName(), basePerson.getAge())
        );

        System.out.println(
                String.format("%s %s", personWithAge.getName(), personWithAge.getAge())
        );

        System.out.println(
                String.format("%s %s", personFull.getName(), personFull.getAge())
        );

    }
}
