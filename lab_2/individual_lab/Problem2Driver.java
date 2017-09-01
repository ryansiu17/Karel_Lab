package lab_2.individual_lab;

/**
   @Author:
      Date:
   Teacher: Appel
       Lab: Problem Set 3
      Misc: Karel plants a garden in a cross-shape
  */
import kareltherobot.*;
import java.awt.Color;

public class Problem2Driver implements Directions
{
    public static void main(String args[])  {
        Problem2 mary = new Problem2(4,2,North,10);
        Problem2 perry = new Problem2(3,3,North,10);
        Problem2 sherry = new Problem2(2,4,North,10);
        Problem2 karel = new Problem2(1, 5, North, 16);        
        Problem2 harry = new Problem2(2,6,North,10);
        Problem2 barry = new Problem2(3,7,North,10);
        Problem2 garry = new Problem2(4,8,North,10);
        mary.set1();
        perry.set2();
        sherry.set3();
        karel.set4();
        harry.set3();
        barry.set2();
        garry.set1();
        mary.turnOff();
        perry.turnOff();
        sherry.turnOff();
        karel.turnOff();
        harry.turnOff();
        barry.turnOff();
        garry.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("fig3-8.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}