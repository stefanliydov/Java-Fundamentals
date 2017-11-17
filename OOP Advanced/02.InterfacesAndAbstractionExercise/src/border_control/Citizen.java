package border_control;

public class Citizen implements Individual {

    private String id;
    private String name;
    private int age;

    public Citizen(String name, int age, String id) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
