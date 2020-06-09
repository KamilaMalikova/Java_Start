package battleship;

import java.util.ArrayList;

public class Ship {
    private int length;
    private ArrayList<String> dots;
    private ArrayList<String> killedDots = new ArrayList<String>();
    private boolean iskilled = false;
    public void setDots(ArrayList<String> location){
        dots = location;
    }

    public void setLength(int Length){
        length = Length;
    }
    public boolean kill(String location){
        if (dots.contains(location)){
            killedDots.add(location);
            return true;
        }
        return false;
    }
    public boolean isKilled(){

        if (killedDots.size() == dots.size()){
            iskilled = true;
        }
        else
        {
            iskilled = false;
        }
        return iskilled;
    }

    public ArrayList<String> getDots(){
        return dots;
    }
}
