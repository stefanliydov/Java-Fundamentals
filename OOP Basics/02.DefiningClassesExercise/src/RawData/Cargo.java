package RawData;

public class Cargo {

    private int weigth;
    private String type;

    public Cargo(int weigth,String type){
        this.weigth = weigth;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
