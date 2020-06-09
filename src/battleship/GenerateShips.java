package battleship;

import java.util.ArrayList;
import java.util.Random;

public class GenerateShips {
    private Ship[] ships;
    private int numOfShips;
    private ArrayList<String> allLocations =new ArrayList<String>();
    public void setNumOfShips(int NumberOfShips){
        if(NumberOfShips<5){
            numOfShips = NumberOfShips;
        }
    }

    public void setShips(){
        Ship[] setShip = new Ship[numOfShips];
        int i = 0;
        while (i < numOfShips){
            System.out.println(i);
            setShip[i] = new Ship();
            setShip[i].setLength(i);
            setShip[i].setDots(generateLocation(i+1));
            ArrayList<String> dots = setShip[i].getDots();
            for(int j = 0; j < dots.size(); j++){
                if(allLocations != null){
                    if (allLocations.contains(dots.get(j))){
                        setShip[i].setDots(generateLocation(i+1));
                        j = -1;
                    }
                }
            }
            allLocations.addAll(setShip[i].getDots());
            i++;
        }
        ships = setShip;
    }

    private ArrayList<String> generateLocation(int length){
       Random random1 = new Random();
       String alphabet = "ABCDEFGHI";
       String numbers = "123456789";
       char lett, num;
       ArrayList<String> coordinates = new ArrayList<String>();
       int isVertical = random1.nextInt(2);
       if(isVertical == 1){
           num = numbers.charAt(random1.nextInt(numbers.length()));
           int random = random1.nextInt(alphabet.length()-length);
           for (int i = 0; i<length; i++){
               lett = alphabet.charAt(random+i);
               StringBuilder coord = new StringBuilder();
               coord.append(lett);
               coord.append(num);
               String dot = coord.toString();
               coordinates.add(dot);

           }
       }
       else {
           lett = alphabet.charAt(random1.nextInt(alphabet.length()));
           int random = random1.nextInt(numbers.length()-length);
           for (int i = 0; i<length; i++){
               num = numbers.charAt(random+i);
               StringBuilder coord = new StringBuilder();
               coord.append(lett);
               coord.append(num);
               String dot = coord.toString();
               coordinates.add(dot);

           }
       }
       return coordinates;
    }

    public Ship[] getShips(){
        return ships;
    }
}
