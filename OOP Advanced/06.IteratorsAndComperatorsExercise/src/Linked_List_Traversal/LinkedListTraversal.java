package Linked_List_Traversal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTraversal implements Iterable<Integer> {

    private List<Integer> list;

    public LinkedListTraversal() {
        this.list = new LinkedList<>();
    }
    public void add(int number){
        list.add(number);
    }
    public boolean remove(int number){
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i) ==number){
                list.remove(i);
                return true;
            }
        }
        return false;
    }
    public int getSize(){
        return this.list.size();
    }
    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListTraversalIter();
    }
    private final class LinkedListTraversalIter implements Iterator<Integer>{
        private int index;

        public LinkedListTraversalIter() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index<list.size();
        }

        @Override
        public Integer next() {
            return list.get(index++);
        }
    }
}
