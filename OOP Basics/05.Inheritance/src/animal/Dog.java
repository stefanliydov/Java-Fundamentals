package animal;

public class Dog extends Animal{


    private String SOUND = "BauBau";

    private String name;
    private int age;
    private String gender;

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String produceSound(){
        return SOUND;
    }

}
