package Threeuple;

public class Threeuple<T,E,S> {

    private T first;
    private E sec;
    private S third;


    public Threeuple(T first, E sec, S third) {
        this.first = first;
        this.sec = sec;
        this.third = third;
    }

    @Override
    public String toString() {
        return first+" -> "+sec+ " -> "+ third;
    }
}
