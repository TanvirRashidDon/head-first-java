package eleventh_chapter.beatbox;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
    public void play(){
        try  {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We got a Sequencer");
        }catch (MidiUnavailableException ex){
            System.out.println("Midi (Musical Instrument Digital Interface) is not available");
        }
    }
}
