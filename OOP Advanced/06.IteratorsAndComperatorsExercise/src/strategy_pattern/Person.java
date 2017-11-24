package strategy_pattern;

public class Person implements Comparable<Person> {

    public String getName() {
        return this.name;
    }
    public static Person castToPerson(Object o){
        return (Person)o;
    }
    public int getAge() {
        return this.age;
    }

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public String toString() {
        return this.name+" "+this.age;
    }
}
