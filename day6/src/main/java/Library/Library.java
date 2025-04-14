package Library;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {

    private List<Book> bookList = new ArrayList<>();

    public void addBook(String name, String author, Year year){
        Book book = new Book(name, author, year);
        bookList.add(book);
    }

    public void booksByYear(){
        Comparator<Book> byYear = Comparator.comparing(Book::getYear);
        bookList.sort(byYear);
        System.out.println(bookList);
    }
    public void booksByTitle(){
        Comparator<Book> byTitle = Comparator.comparing(Book::getTitle);
        bookList.sort(byTitle);
        System.out.println(bookList);
    }
    public void booksByAuthor(){
        Comparator<Book> byAuthor = Comparator.comparing(Book::getAuthor);
        bookList.sort(byAuthor);
        System.out.println(bookList);
    }

    public void showBooks(){
        System.out.println("Books order by Year:\n");
        booksByYear();
        System.out.println("Books order by Title:\n");
        booksByTitle();
        System.out.println("Books order by Author:\n");
        booksByAuthor();
    }

    public void showBooksByAuthor(String author) {
        System.out.println("Books by "+ author + ":");
        for (Book book : bookList){
            if (book.getAuthor().equalsIgnoreCase(author)){
                System.out.println("Title: " + book.getTitle() + " - Year: " + book.getYear());
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Lord of the Rings","J.R.R Tolkien", Year.of(1954));
        library.addBook("Narnia","C.S Lewis",Year.of(1956) );
        library.addBook("Crepusculo","Stephenie Meyer",Year.of(2005) );
        library.addBook("StarWars","George Lucas",Year.of(1976));
        library.addBook("StarWars2","George Lucas",Year.of(1979));

        library.showBooks();

        library.showBooksByAuthor("George Lucas");
    }
}
