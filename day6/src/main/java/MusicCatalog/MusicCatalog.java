package MusicCatalog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MusicCatalog {

    private List<Song> songsList = new ArrayList<>();

    public void addSong(String title, String artist, int duration, String genre) {
        Song song = new Song(title, artist, duration, genre);
        songsList.add(song);
    }

    public void showAllSongs(){
        System.out.println("Songs List: \n"+songsList);
    }

    public void showSongsByDuration(){
        List<Song> order = new ArrayList<>(songsList);
        Comparator<Song> byDuration = Comparator.comparing(Song::getDuration);
        order.sort(Collections.reverseOrder(byDuration));
        System.out.println("Songs by Duration: \n"+order);
    }
    public void showSongsByTitle(){
        List<Song> order = new ArrayList<>(songsList);
        Comparator<Song> byTitle = Comparator.comparing(Song::getTitle);
        order.sort(byTitle);
        System.out.println("Songs by Title: \n"+order);
    }
    public void songsByGenre(String genre){
        System.out.println("Songs from genre " + genre + ":\n");
        for (Song song : songsList) {
            if (song.getGenre().equalsIgnoreCase(genre)) {
                System.out.println("- "+song.getTitle());
            }
        }
    }

    public void songsByArtist(String artist) {
        System.out.println("Songs from Artist " + artist + ":\n");
        for (Song song : songsList) {
            if (song.getArtist().equalsIgnoreCase(artist)) {
                System.out.println("- "+song.getTitle());
            }
        }
    }

    public static void main(String[] args) {
        MusicCatalog musicCatalog = new MusicCatalog();
        musicCatalog.addSong("Waterfall","Dimitri",4,"Rock");
        musicCatalog.addSong("Wonderwall","Coldplay",3,"Pop");
        musicCatalog.addSong("Alleluyah","Hillsong",5,"Cristian");
        musicCatalog.addSong("Oceans","Hillsong",6,"Cristian");
        musicCatalog.addSong("BlueSky","Ramdom guy",3,"Folk");

        musicCatalog.showAllSongs();
        musicCatalog.showSongsByDuration();
        musicCatalog.showSongsByTitle();
        musicCatalog.songsByGenre("Cristian");
        musicCatalog.songsByArtist("hillsong");
    }
}
