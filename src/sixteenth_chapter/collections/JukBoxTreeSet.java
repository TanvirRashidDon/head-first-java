package sixteenth_chapter.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.TreeSet;

public class JukBoxTreeSet {
    TreeSet<String> songList = new TreeSet<String>();

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
        songList.add(token[0]);
    }
}
