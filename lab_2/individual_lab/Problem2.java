package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        
    }
    public void set4(){
    movePut();
    move();
    movePut();
    move();
    movePut();
    move();
    movePut();
    move();
    }
    public void set3(){
    movePut();
    move();
    movePut();
    move();
    movePut();
    move();
    }
    public void set2(){
    movePut();
    move();
    movePut();
    move();
    }
    public void set1(){
    movePut();
    move();
    }
    public void movePut(){
    move();
    putBeeper();        
    }
}
