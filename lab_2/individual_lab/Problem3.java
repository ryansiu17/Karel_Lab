package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem3
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    public void buildH(){
    set5();
    turnLeft();
    turnLeft();
    set2();
    turnLeft();
    set3();
    turnLeft();
    set2();
    turnLeft();
    turnLeft();
    set4();   
    move();
    }
    public void buildE(){
    set3();
    turnRight();
    set2();
    turnRight();
    set2();
    turnLeft();
    turnLeft();
    set2();
    turnRight();
    set2();
    turnRight();
    set2();
    move();
    }
    public void buildl(){
    set3();
    turnRight();
    set4();    
    move();
    }
    public void buildo(){
    set3();
    turnLeft();
    set4();
    turnLeft();
    set2();
    turnLeft();
    set3();
    move();
    move();
    }
    public void set5(){
    movePut();
    movePut();
    movePut();
    movePut();
    movePut();
    }
    public void set4(){
    movePut();
    movePut();
    movePut();
    movePut();
    }
    public void set3(){
    movePut();
    movePut();
    movePut();
    }
    public void set2(){
    movePut();
    movePut();
    }
    public void set1(){
    movePut();
    }
    public void movePut(){
    move();
    putBeeper();        
    }
    public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
    }
}
