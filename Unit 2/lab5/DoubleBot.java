 
import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers = 0;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
        // put your code here
        move();
        checkInitialBeeps();
        move();
        placeDouble();
        move();
    }
    public void print(int value){
        System.out.println(value);
    }
    public void checkInitialBeeps(){
        while(nextToABeeper()){
            pickBeeper();
            beepers++;
            print(beepers);
        }
    }
    public void placeDouble(){
        beepers = beepers*2;
        print(beepers);
        while(beepers > 0){
            putBeeper();
            beepers--;
        }
    }
}
