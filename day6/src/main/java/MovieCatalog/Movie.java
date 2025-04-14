package MovieCatalog;

import java.time.Year;

public class Movie {
    private String title;
    private String director;
    private int duration;
    private Year year;

    public Movie(String title, String director, int duration, Year year) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Movie= " + title + " - director= " + director +" - duration=" + duration +
                " - year= " + year +
                '\n';
    }

    public Year getYear() {
        return year;
    }
}
