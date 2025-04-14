package Library;

import java.time.Year;

public class Book {
    private String title;
    private String author;
    private Year year;


    public Book(String title, String author, Year year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Year getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book: " + title + ", Author: " + author + ", Year: " + year + "\n";
    }
}
