package DataStructure;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;

public class Song implements Comparable<Song>{
    String title;
    String artist;
    Song(String t, String a) {
        title = t;
        artist = a;
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public String toString() {
        return artist;
    }

    @Override
    public int compareTo(Song o) {
        return artist.compareTo(o.getArtist());
    }

    @Override
    public boolean equals(Object o) {
       /* if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(title, song.title) &&
                Objects.equals(artist, song.artist);*/
        Song s = (Song) o;
        return getTitle().equals(s.getTitle());
    }

    public int hashCode(){
        return title.hashCode();
    }

}
