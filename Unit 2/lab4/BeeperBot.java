
import kareltherobot.*; 


/**
 * @author :  rs
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        while(frontIsClear()){
            collectBeepSteep();
            }
    }
    public void findBeepers() {
        faceEast();
        while(!nextToABeeper()) {
            move();
        }
    }
    public void faceSouth(){
        while(!facingSouth()){
            turnLeft();
        }
    }
    public void faceEast(){
        while(!facingEast()){
            turnLeft();
        }
    }
    public void collectBeepSteep(){
        findBeepers();
        turnLeft();
        while(nextToABeeper()){
            pickBeeper();
            move();
        }
        exitSteeple();
    }
    public void exitSteeple(){
        faceSouth();
        while(frontIsClear()){
            move();
        }
        turnLeft();
    }
}
