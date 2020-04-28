package sixteenth_chapter.collections;

import java.util.ArrayList;
import java.io.*;

public class JukBoxArrayList {

    ArrayList<String> songList = new ArrayList<String>();

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
