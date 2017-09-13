
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        while(!nextToABeeper()){
            checkCorner();
            putAndMove();
        }
    }
    public void putAndMove(){
        putBeeper();
        move();
    }
    public void checkCorner(){
        turnLeft();
        if(frontIsClear()){
            putAndMove();
            turnLeft();
            putAndMove();
            if(!frontIsClear()){
                turnRight();
            }
        }
        else{
            turnRight();
            if(!frontIsClear()){
                turnRight();
            }
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

