package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  R. Siu
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void giveCarlBeeper() {
        moveToCarl();
        putBeeper();//This method should allow karel, who is at (1, 1) to give a beeper to carl (at 1, 4)
        returnKarel();
    }
    
    public void pickAndMoveBeeper() {
        pickBeeper();
        moveTwo();
        putBeeper();
        returnCarl();//This method is for carl to pick up the beeper from karel and move it two blocks north
    }
    public void moveToCarl() {
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
    }
    public void returnKarel() {
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveTwo() {
        turnLeft();
        move();
        move();
    }
    public void returnCarl() {
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
    }
}