package sixteenth_chapter.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.TreeSet;

public class JukBoxTreeSet {
    TreeSet<Song> songList = new TreeSet<Song>();

    public void go(){
        getSong();
        System.out.println(songList);
    }

    void getSong(){
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line = null;

            while ((line = reader.readLine()) != null){
                addSong(line);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    void addSong(String line){
        String[] token = line.split("/");

        Song s = new Song(token[0], token[1], token[2], token[3]);
        songList.add(s);
    }
}
