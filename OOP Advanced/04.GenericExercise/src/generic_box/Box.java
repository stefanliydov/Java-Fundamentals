package generic_box;

public class Box<T> {

    private T str;
    public Box(T str){
        this.str = str;
    }

    @Override
    public String toString() {
        return str.getClass().getName()+": "+str;
    }
}
