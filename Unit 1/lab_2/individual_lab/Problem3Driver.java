package lab_2.individual_lab;

/**
   @Author: Ry S
      Date: 8/30/17
   Teacher: Appel
       Lab: Problem Set 3
      Misc: Karel writes HELLO
  */
import kareltherobot.*;
import java.awt.Color;

public class Problem3Driver implements Directions
{
    public static void main(String args[])  {
    Problem3 h_builder = new Problem3(2 ,2 ,North,-1);
    Problem3 e_builder = new Problem3(3 ,10 ,West,-1);
    Problem3 l_builder = new Problem3(3 ,14 ,West,-1);
    Problem3 l_builder_2 = new Problem3(3 ,18 ,West,-1);
    Problem3 o_builder = new Problem3(3 ,18 ,East,-1);
    h_builder.buildH();
    e_builder.buildE();
    l_builder.buildl();
    l_builder_2.buildl();
    o_builder.buildo();
    h_builder.turnOff();
    e_builder.turnOff();
    l_builder.turnOff();
    l_builder_2.turnOff();
    o_builder.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/10x30.kwld"); 
        World.setBeeperColor(Color.black);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}