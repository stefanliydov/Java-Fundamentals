package birthday_celebrations;

public class Citizen implements Individual {

    private String id;
    private String name;
    private int age;
    private String birthday;

     Citizen(String name, int age, String id, String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }
}
