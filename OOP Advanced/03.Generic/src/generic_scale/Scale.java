package generic_scale;

public class Scale<T extends Comparable<T>> {

    private T right;
    private T left;
    public Scale(T left, T right){
        this.left=left;
        this.right=right;
    }

    public T getHeavier(){
        if(right.compareTo(left)<0){
            return left;
        }
        if(right.compareTo(left)>0){
            return right;
        }
        return null;
    }
}
