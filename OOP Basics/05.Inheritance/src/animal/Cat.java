package animal;

public class Cat extends Animal{


    private final String SOUND = "MiauMiau";

    private String name;
    private int age;
    private String gender;

    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String produceSound(){
        return SOUND;
    }

}
