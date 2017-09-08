package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1Driver implements Directions
{
    public static void main(String args[])  {
        Problem1 karel = new Problem1(1, 1, South, -1);
        Problem1 sarel = new Problem1(1, 1, North, -1);
        Problem1 garel = new Problem1(1, 1, West, -1);
        Problem1 barel = new Problem1(1, 1, East, -1);
        karel.faceEast();
        sarel.faceEast();
        barel.faceEast();
        garel.faceEast();
        
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/10x30.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(40);  
        World.setVisible(true);
    }
}
