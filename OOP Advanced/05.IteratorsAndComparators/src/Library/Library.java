package Library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library<Book> implements Iterable<Book> {

    private Book[] books;

    @SafeVarargs
    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private final class LibIterator implements Iterator<Book> {
        private int index;

        public LibIterator(){
            this.index = 0;
        }
        @Override
        public boolean hasNext() {
            return this.index<books.length;
        }

        @Override
        public Book next() {

            return books[index++];
        }
    }
}
