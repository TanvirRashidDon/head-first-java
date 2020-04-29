package sixteenth_chapter.collections;

public class Song implements Comparable<Song>{
    String title;
    String artist;
    String rating;
    String bpm;

    public Song(){}

    public Song(String t, String a, String r, String b){
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public String getTitle() { return title; } 

    public String getArtist() { return artist; }

    public String getRating() { return rating; }

    public String getBpm() { return bpm; }

    public String toString(){
        return getTitle();
    }

    @Override
    public int compareTo(Song o) {
        return title.compareTo(o.getTitle());
    }
}
