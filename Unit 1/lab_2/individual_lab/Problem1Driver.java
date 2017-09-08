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

public class Problem1Driver implements Directions
{
    public static void main(String args[])  {
        Problem1 karel = new Problem1(5, 1, East, 10);
        karel.setPins();
        karel.turnOff();
        Problem1 bob = new Problem1(4,2,East,10);
        bob.set3();
        bob.turnOff();
        Problem1 harry = new Problem1(3,3,East,10);
        harry.set2();
        harry.turnOff();
        Problem1 paul = new Problem1(2,4,East,10);
        paul.set1();
        paul.turnOff();
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