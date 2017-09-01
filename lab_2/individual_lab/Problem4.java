package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem4 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem4(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    public void build3(){
    move();
    putMove();
    putMove();
    putBeeper();
    turnLeft();
    move();
    putMove();
    putBeeper();
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
    putBeeper();
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
    public void build1(){
    movePut();
    movePut();
    movePut();
    movePut();
    movePut();
    move();
    }
    public void putMove(){
    putBeeper();
    move();
    }
    public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
    }
    public void turnAround(){
    turnLeft();
    turnLeft();
    }
    public void movePut(){
    move();
    putBeeper();
    }
}
