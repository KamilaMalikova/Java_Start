package MusicTester;

import javax.sound.midi.*;
import javax.swing.*;

import static java.lang.System.out;
public class MusicTester implements ControllerEventListener{
    static JFrame frame = new JFrame("Music video");
    static MyDrawingPanel ml;
    public static void main(String[] args) {
        MusicTester mt = new MusicTester();
        mt.play();
        return;
    }

    public void setUpGUI(){
        ml = new MyDrawingPanel();
        frame.setContentPane(ml);
        frame.setBounds(100, 30, 300, 300);
        frame.setVisible(true);

    }

    public void play(){
        setUpGUI();
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int[] eventIWant = {127, 144};
            sequencer.addControllerEventListener(this, eventIWant);

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i = 0; i < 61; i+=4){
                track.add(makeEvent(144, 1, i, 100, i));
                track.add(makeEvent(176, 2, 127, 0, i));
                track.add(makeEvent(144, 1, i, 100, i+2));
            }



            /*ShortMessage a = new ShortMessage();
            a.setMessage(192, 1, 102, 100);
            MidiEvent noteOn = new MidiEvent(a,1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(192, 1, 102, 100);
            MidiEvent noteOff = new MidiEvent(b, 3);
            track.add(noteOff);*/

            sequencer.setSequence(seq);
           // sequencer.setTempoInBPM(220);
            sequencer.start();

        } catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            out.println("finally");
        }
        return;
    }
    //risky, exception throwing code
    public void takeRisk() throws Exception{
        throw new Exception();
    }

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
        MidiEvent event = null;
        try {
            ShortMessage a =new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        }
        catch (Exception e){

        }
        return event;
    }

    @Override
    public void controlChange(ShortMessage event) {
        out.println("la");
    }
}
