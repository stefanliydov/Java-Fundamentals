package Multiple_Implementation;

public class Citizen implements Person,Birthable,Identifiable {

    private String name;
    private int age;
    private String id;
    private String birthDay;


    public Citizen(String name, int age,String id,String birthDay) {
        this.name = name;
        this.age = age;
        this.id=id;
        this.birthDay=birthDay;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public String getBirthDate() {
        return this.birthDay;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
