package MovieCatalog;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieManager {

    private List<Movie> moviesList = new ArrayList<>();

    public void addMovie(String title, String director, int duration, Year year){
        Movie movie = new Movie(title,director,duration,year);
        moviesList.add(movie);
    }

    public void showAllMovies(){
        System.out.println("Movies List: \n"+ moviesList);
    }

    public void showMoviesByDuration(){
        List<Movie> comparable = new ArrayList<>();
        comparable = moviesList;
        Comparator<Movie> byDuration = Comparator.comparing(Movie::getDuration);
        comparable.sort(Collections.reverseOrder(byDuration));
        System.out.println("Movies by Duration:\n" + comparable);
    }

    public void showMoviesByTitle(){
        List<Movie> comparable = new ArrayList<>();
        comparable = moviesList;
        Comparator<Movie> byTitle = Comparator.comparing(Movie::getTitle);
        comparable.sort(byTitle);
        System.out.println("Movies by Title:\n" + comparable);
    }

    public void showMoviesByYear(){
        List<Movie> comparable = new ArrayList<>();
        comparable = moviesList;
        Comparator<Movie> byYear = Comparator.comparing(Movie::getYear);
        comparable.sort(Collections.reverseOrder(byYear));
        System.out.println("Movies by Year: \n" + comparable);
    }

    public void allMoviesByDirector(String director) {
        System.out.println("All movies from "+ director + ":");
        for (Movie movie : moviesList) {
            if (movie.getDirector().equalsIgnoreCase(director)) {
                System.out.println(movie.getTitle());
            }
        }
    }

    public static void main(String[] args) {
        MovieManager movieManager = new MovieManager();
        movieManager.addMovie("Lord of the Rings","J.R.R Tolkien",60, Year.of(1954));
        movieManager.addMovie("Narnia","C.S Lewis",55,Year.of(1956) );
        movieManager.addMovie("Crepusculo","Stephenie Meyer",40,Year.of(2005) );
        movieManager.addMovie("StarWars","George Lucas",65,Year.of(1976));
        movieManager.addMovie("StarWars2","George Lucas",63,Year.of(1979));

        movieManager.showAllMovies();
        movieManager.showMoviesByDuration();
        movieManager.showMoviesByTitle();
        movieManager.showMoviesByYear();
        movieManager.allMoviesByDirector("George Lucas");
    }
}
