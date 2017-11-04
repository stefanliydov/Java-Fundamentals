package animal;

public class Kitten extends Cat{


    private final String SOUND = "Miau";

    private String name;
    private int age;
    private String gender;

    public Kitten(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String produceSound(){
        return SOUND;
    }

    @Override
    public void setGender(String gender) {
        if(!gender.equals(Animal.FEMALE_GENDER)){
            throw new IllegalArgumentException(ErrorMessagesConstant.ERROR_MESSAGE);
        }
        super.setGender(gender);
    }
}
