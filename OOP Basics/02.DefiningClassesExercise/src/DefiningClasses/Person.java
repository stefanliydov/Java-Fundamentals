package DefiningClasses;

public class Person {
    private String name;
    private int age;

    public Person() {
        this(1);
    }

    public Person(int age) {
        this("No name", age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
