package Google;

public class Parent {

    private String name;
    private String birthDate;

    public Parent(String name, String birthday){
        this.name=name;
        this.birthDate = birthday;
    }
    @Override
    public String toString() {
        return this.name+" "+this.birthDate+"\n";
    }
}
