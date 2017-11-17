package food_shortage;

public class Rebel implements Individual {

    private String name;
    private int age;
    private String group;


   public Rebel(){

    }
    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @Override
    public String getBirthday() {
        return null;
    }
}
