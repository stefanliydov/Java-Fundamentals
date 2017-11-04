package animal;

public class Tomcat extends Cat{


    private final String SOUND = "Give me one million b***h";

    private String name;
    private int age;
    private String gender;

    public Tomcat(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String produceSound(){
        return SOUND;
    }

    @Override
    public void setGender(String gender) {
        if(!gender.equals(Animal.MALE_GENDER)){
            throw new IllegalArgumentException(ErrorMessagesConstant.ERROR_MESSAGE);
        }
        super.setGender(gender);
    }
}
