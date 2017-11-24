package generic_count_Method_string;

public class Box<T extends Comparable<T>> {

    private T str;
    public Box(T str){
        this.str = str;
    }

    public static int compare(Box base,Box curr){
        if(base.str.compareTo(curr.str)<0){
            return 1;
        }
        return 0;
    }
    @Override
    public String toString() {
        return str.getClass().getName()+": "+str;
    }
}
