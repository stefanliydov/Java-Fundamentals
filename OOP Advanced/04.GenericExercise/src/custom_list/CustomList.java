package custom_list;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> list;

   public CustomList(){
        this.list = new ArrayList<>();
    }
    public void add(T element){
        this.list.add(element);
    }

    public T remove(int index){
       return this.list.remove(index);
    }

    public boolean contains(T element){
        return this.list.contains(element);
    }

    public void swap(int first, int sec){
        T temp = this.list.get(first);
        this.list.set(first,this.list.get(sec));
        this.list.set(sec,temp);
    }
    public int countGreaterThan(T element){
        int count =0;
        for (T el:
             this.list) {
            if(element.compareTo(el)<0){
                count++;
            }
        }
        return count;
    }

    public T getMax(){
        T max = list.get(0);
        for (int i = 1; i <list.size(); i++) {
            if(max.compareTo(list.get(i))<0){
                max = list.get(i);
            }
        }
        return max;
    }

    public T getMin(){
        T min = list.get(0);
        for (int i = 1; i <list.size(); i++) {
            if(min.compareTo(list.get(i))>0){
                min = list.get(i);
            }
        }
        return min;
    }
    public List<T> getList(){
        return Collections.unmodifiableList(this.list);
    }
}
