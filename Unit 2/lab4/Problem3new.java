 

 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3new extends Robot
{
    public Problem3new(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void closeAllWindows() {
        while(!nextToABeeper()){
            checkForWindow();
            checkForCorner();
            move();
        }
    }
    public void checkForWindow(){
        turnLeft();
        if(frontIsClear()){
            turnRight();
            putBeeper();
        }
        else{
            turnRight();
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void checkForCorner(){
        if(!frontIsClear()){
            turnRight();
        }
    }
}

