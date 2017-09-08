package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class destroy extends Problem4
{
   
    /**
     * Constructor for objects of class DESRTR
     */
    public destroy(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    public void build3(){
    move();
    putMove();
    putMove();
    pickBeeper();
    turnLeft();
    move();
    putMove();
    pickBeeper();
    turnLeft();
    movePut();
    movePut();
    turnLeft();
    turnLeft();
    move();
    move();
    turnLeft();
    movePut();
    movePut();
    turnLeft();
    movePut();
    movePut();
    move();
    }
    public void build2(){
    move();
    putMove();
    putMove();
    pickBeeper();
    turnRight();
    movePut();
    movePut();
    turnRight();
    movePut();
    movePut();
    turnLeft();
    movePut();
    movePut();
    turnLeft();
    movePut();
    movePut();
    move();
    }
    public void putMove(){
    pickBeeper();
    move();
    }
    public void movePut(){
    move();
    pickBeeper();
    }
}
