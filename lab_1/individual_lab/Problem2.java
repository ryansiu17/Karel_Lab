package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        turnLeft();
        move();
        turnRightMoveFour();
        turnLeftMoveEight();
        turnRightMove();
        move();
        turnRightMove();
        turnRight();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void turnRightMoveFour() {
    turnRight();
    move();
    move();
    turnRight();
    move();
    move();    
    }
    public void turnLeftMoveEight(){
    turnLeft();
    move();
    move();
    turnLeft();
    move();
    move();
    turnLeft();
    move();
    move();
    turnLeft();
    move();
    move();        
    }
    public void turnRightMove(){
    turnRight();
    move();
    }
}