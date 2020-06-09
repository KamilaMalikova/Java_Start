package battleship;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numOfShips = 3;
        int numOfKilled = 0;
        GenerateShips generator = new GenerateShips();
        generator.setNumOfShips(numOfShips);
        generator.setShips();
        Ship[] ships = generator.getShips();
        while (numOfKilled != numOfShips){
            for (Ship ship: ships) {
                System.out.println(ship.getDots());
                if (ship.isKilled()){
                    numOfKilled++;
                }
            }

            System.out.print("Enter a coordinate (A2): ");
            String coordinate = new Scanner(System.in).nextLine();
            for (Ship ship: ships) {
                if (ship.kill(coordinate)){
                    if (ship.isKilled()){
                        System.out.println("Kill");
                    }
                    else System.out.println("Hit");
                }
            }
        }

    }
}
