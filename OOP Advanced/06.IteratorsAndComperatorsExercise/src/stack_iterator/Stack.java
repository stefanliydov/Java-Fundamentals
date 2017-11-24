package stack_iterator;


import java.util.*;

public class Stack implements Iterable<Integer> {

    private List<Integer> stack;
    Stack(){
        stack= new LinkedList<>();
    }
    public void Push(String... numbers){
        for (String num:
             numbers) {
            stack.add(Integer.valueOf(num));
        }

    }
    public void Pop(){
        if(stack.size()==0){
            throw new IllegalArgumentException("No elements");
        }
        stack.remove(stack.size()-1);
    }
    @Override
    public Iterator<Integer> iterator() {
        return new StackIterator();
    }
    private final class StackIterator implements Iterator<Integer>{
        private int index;

        public StackIterator() {
            this.index = stack.size()-1;
        }

        @Override
        public boolean hasNext() {
            return index >=0;
        }

        @Override
        public Integer next() {
            return stack.get(index--);
        }
    }
}
