package froggy;

import java.lang.reflect.Array;
import java.util.*;

public class Lake<T extends Integer> implements Iterable<Integer> {

    private List<Integer> steps;

    Lake(Integer... steps){
        this.steps = new ArrayList<>();
        this.steps = Arrays.asList(steps);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private final class Frog implements Iterator<Integer>{
        private int index;
        private List<Integer> indexes;
        public Frog() {
            this.index = 0;
            indexes = new ArrayList<>();
            this.setIndexes();
        }

        @Override
        public boolean hasNext() {
            return this.index <steps.size();
        }

        @Override
        public Integer next() {
                return steps.get(indexes.get(index++));
        }
    private void setIndexes(){
        for (int i = 0; i <steps.size() ; i+=2) {
            this.indexes.add(i);
        }
        for (int i = 1; i < steps.size(); i+=2) {
            this.indexes.add(i);
        }
    }
    }
}
