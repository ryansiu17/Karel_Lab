package lab_4.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        findWall();
        searchForWindow();
    }
    public void findWall() {
        while(frontIsClear()){
            move();    
        }
        turnLeft();
    }
    public boolean searchForWindow(){
        while(!searchForWindow()){
            if (frontIsClear()){
                turnRight();
                if(frontIsClear()){
                    return true;
                }
                else{
                    turnLeft();
                }
            }
            else{
                turnLeft();
            }    
            move();
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

