package birthday_celebrations;

public class Robot implements Individual {

    private String id;
    private String model;

    public Robot(String model, String id) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getBirthday() {
        return null;
    }
}
