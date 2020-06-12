package BeatBoxPlayer;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import static java.lang.System.out;

public class BeetBox {
    private JFrame frame;
    private Box panelWest;
    private Box panelEast;
    private JPanel panelCenter;
    private ArrayList<JCheckBox> checkBoxList = new ArrayList<JCheckBox>();
    private JButton btnStart;
    private JButton btnStop;
    private JButton btnTempoUp;
    private JButton btnTempoDown;
    private JButton btnSaveToFile;
    private JButton btnOpenFromFile;

    private Sequencer sequencer;
    private Sequence sequence;
    private Track track;

    private final String[] instrumentNames = {"Bass Drum", "Closed Hi-Hat",
            "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal", "Hand Clap",
            "Cowbell", "Vidraslap", "Low-mid Tom", "High Agogo", "Open Hi Conga"};
    final private int[] instruments = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};

    public static void main(String[] args) {
        BeetBox beetBox = new BeetBox();
        beetBox.go();
    }

    public void go(){
        panelCenter = new JPanel();
        panelEast = new Box(BoxLayout.Y_AXIS);
        panelWest = new Box(BoxLayout.Y_AXIS);
        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");
        btnTempoUp = new JButton("Tempo up");
        btnTempoDown = new JButton("Tempo down");
        btnSaveToFile = new JButton("Save to file");
        btnOpenFromFile = new JButton("Open from file");

        frame = new JFrame("BeetBox player");

        btnStart.addActionListener(new StartListener());
        btnStop.addActionListener(new StopListener());
        btnTempoUp.addActionListener(new UpTempoListener());
        btnTempoDown.addActionListener(new DownTempoLiastener());
        btnOpenFromFile.addActionListener(new OpenFromFileListener());
        btnSaveToFile.addActionListener(new SaveToFileListener());

        for (int i = 0; i<instrumentNames.length; i++){
            panelWest.add(new JLabel(instrumentNames[i]));
        }

        for (int i = 0; i<256; i++){
            JCheckBox checkBox = new JCheckBox();
            checkBox.setSelected(false);
            checkBoxList.add(checkBox);
            panelCenter.add(checkBox);
        }

        panelEast.add(btnStart);
        panelEast.add(btnStop);
        panelEast.add(btnTempoUp);
        panelEast.add(btnTempoDown);
        panelEast.add(btnSaveToFile);
        panelEast.add(btnOpenFromFile);

        frame.getContentPane().add(BorderLayout.EAST, panelEast);
        frame.getContentPane().add(BorderLayout.WEST, panelWest);
        frame.getContentPane().add(BorderLayout.CENTER, panelCenter);

        setUpMidi();

        frame.setSize(630, 460);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setVisible(true);
    }

    public void setUpMidi(){
        try{
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void buildTrackAndStart(){
        int[] trackList = null;
        sequence.deleteTrack(track);
        track = sequence.createTrack();

        for (int i = 0; i<16; i++){
            trackList = new int[16];

            int key = instruments[i];

            for (int j = 0; j< 16; j++){
                JCheckBox jc = checkBoxList.get(j+(16*i));
                if (jc.isSelected()){
                    trackList[j] = key;
                }
                else{
                    trackList[j] = 0;
                }
            }
            makeTrack(trackList);
            track.add(makeEvent(172, 1, 127, 0, 16));
        }

        
        track.add(makeEvent(192, 9, 1, 0, 15));
        try{
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
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

    public void makeTrack(int[] list){
        for (int i = 0; i<list.length; i++){
            int key = list[i];
            if (key!=0){
                track.add(makeEvent(144, 9, key, 100, i));
                track.add(makeEvent(128, 9, key, 100, i+1));
            }
        }
    }

    private class StartListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            out.println("Start");
            buildTrackAndStart();
        }
    }
    private class StopListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            sequencer.stop();
        }
    }
    private class UpTempoListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float)(tempoFactor*1.03));
        }
    }

    private class DownTempoLiastener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float)(tempoFactor*0.97));
        }
    }

    private class SaveToFileListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
            FileOutputStream fileOutputStream = new FileOutputStream("beats.sir");
            ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
            os.writeObject(checkBoxList);
            os.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

    private class OpenFromFileListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                FileInputStream fileInputStream = new FileInputStream("beats.sir");
                ObjectInputStream os = new ObjectInputStream(fileInputStream);
                Object object = os.readObject();
                ArrayList<JCheckBox> checkBoxList2 = (ArrayList<JCheckBox>)object;
                //panelCenter.removeAll();
                for (int i = 0; i< checkBoxList.size(); i++){
                    checkBoxList.get(i).setSelected(checkBoxList2.get(i).isSelected());
                }
                for (JCheckBox checkBox: checkBoxList2) {
                    panelCenter.add(checkBox);
                }
                os.close();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

}
