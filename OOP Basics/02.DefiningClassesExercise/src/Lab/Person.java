package Lab;

public class Person {

    private String name;
    private int age;

    public void Person(){
        this.name = "No name";
        this.age = 1;
    }
    public void Person(int age){
        this.age = age;
        this.name = "No name";
    }
    public void Person(String name, int age){
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
