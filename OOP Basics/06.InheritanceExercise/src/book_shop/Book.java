package book_shop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Book {

    private String author;
    private String title;
    private double price;

      Book (String author, String title, double price) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }

    private void setTitle(String title) {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    private void setAuthor(String author) {
        Pattern pattern = Pattern.compile("\\w+\\s\\d\\w*");
        Matcher matcher = pattern.matcher(author);
        if (matcher.find()) {
            throw new IllegalArgumentException("Author not valid!");
        }
        this.author = author;
    }

    private String getAuthor() {
        return this.author;
    }

    private String getTitle() {
        return this.title;
    }

    protected double getPrice() {
        return this.price;
    }

    private void setPrice(double price) {
        if (price < 1) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();

    }
}

