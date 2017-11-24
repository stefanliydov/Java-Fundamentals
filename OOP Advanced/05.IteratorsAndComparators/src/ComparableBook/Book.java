package ComparableBook;

import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{

    private String title;
    private int year;
    private List<String> authors;


    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setAuthors(String... authors) {
        this.authors = Arrays.asList(authors);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book o) {
        if(this.title.compareTo(o.title) ==0){
            return this.year - o.year;
        }
        return this.title.compareTo(o.title);
    }

    public int getYear() {
        return year;
    }
}
