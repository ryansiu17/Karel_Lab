 
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
    boolean window;
    public void searchForWindow(){
        while(window == false){
            if (frontIsClear()){
                move();
                turnRight();
                if(frontIsClear()){
                    move();
                    window = true;
                }
                else{
                    turnLeft();
                }
            }
            else{
                turnLeft();
            }   
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

