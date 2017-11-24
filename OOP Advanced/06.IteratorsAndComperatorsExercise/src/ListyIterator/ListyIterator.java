package ListyIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator<String> implements Iterable<String> {

    private int index;

    private List<String> collection;

    public ListyIterator(String... collection) {
        this.collection = Arrays.asList(collection);
        this.index = 0;
    }

    public boolean move() {
        if (this.collection.size() - 1 == this.index) {
            return false;
        }
        this.index++;
        return true;
    }

    public boolean hasNext() {
        return this.collection.size() - 1 != this.index;
    }

    public void print() {
        if (this.collection.size() == 0) {
            throw new CollectionWithoutElementsException("Invalid Operation!");
        }
        System.out.println(this.collection.get(this.index));
    }

    public void printAll() {
        StringBuilder sb = new StringBuilder();
        for (String string : this) {
            sb.append(string).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    @Override
    public Iterator<String> iterator() {
        return new ListIteratorClassIterator();
    }

    private final class ListIteratorClassIterator implements Iterator<String> {

        private int index;

        public ListIteratorClassIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return this.index < collection.size();
        }

        @Override
        public String next() {
            return collection.get(this.index++);
        }
    }
}