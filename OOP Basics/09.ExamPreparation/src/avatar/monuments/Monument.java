package avatar.monuments;

public abstract class Monument {


    private String name;

    Monument(String name){
        this.name=name;
    }

    public abstract int getPower();

     String getName() {
        return this.name;
    }
}
