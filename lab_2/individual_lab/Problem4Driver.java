package lab_2.individual_lab;

/**
   @Author:RYANSIU
      Date:
   Teacher: Appel
       Lab: Problem Set 4
      Misc: C
  */
import kareltherobot.*;
import java.awt.Color;

public class Problem4Driver implements Directions
{
    public static void main(String args[])  {
    Problem4 builder_3 = new Problem4(2 ,2 ,East,-1);
    Problem4 builder_2 = new Problem4(6 ,2 ,East,-1);
    Problem4 builder_1  = new Problem4(7 ,5 ,South,-1);
    destroy destroy_3 = new destroy(2,2, East, -1);
    destroy destroy_2 = new destroy(6 ,2 ,East,-1);
    destroy destroy_1  = new destroy(7 ,5 ,South,-1);
    //builder_1.build3();
    builder_3.build3();
    destroy_3.build3();
    builder_2.build2();
    destroy_2.build2();
    builder_1.build1();
    destroy_1.build1();
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/10x30.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}