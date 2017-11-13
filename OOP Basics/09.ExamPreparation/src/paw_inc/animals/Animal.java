package paw_inc.animals;

public abstract class Animal {

    private String name;
    private int age;
    private boolean cleansingStatus;
    private String adoptionCenter;


    protected Animal(String name,int age) {
        this.name = name;
        this.age = age;
        this.cleansingStatus = false;
    }
    protected Animal(String name,int age, String adoptionCenter) {
        this(name, age);
        this.adoptionCenter = adoptionCenter;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isCleansingStatus() {
        return this.cleansingStatus;
    }

    public void cleanse(){
        this.cleansingStatus = true;
    }

    public String getAdoptionCenter() {
        return this.adoptionCenter;
    }
}
