package paw_inc.animals;

public class Dog extends Animal {

    private int command;
    public Dog(String name, int age, int command,String adoptionCenter) {
        super(name, age,adoptionCenter);
        this.command = command;
    }

    public int getCommand() {
        return this.command;
    }

    public void setCommand(int command) {
        this.command = command;
    }
}
