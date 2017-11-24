package comparing_objects;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person person) {
        if (this.name.compareTo(person.name) != 0) {
            return this.name.compareTo(person.name);
        } else if (Integer.compare(this.age, person.age) != 0) {
            return Integer.compare(this.age, person.age);
        } else {
            return this.town.compareTo(person.town);
        }
    }
}
