package equality_logic;



public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        int result = this.name.compareTo(o.getName());
        if(result ==0){
            result = Integer.compare(this.age,o.getAge());
        }
        return result;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person)){
            return false;
        }
        Person other= (Person) obj;
        return this.getName().equals(other.getName()) && this.getAge()== other.getAge();

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
