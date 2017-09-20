 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void fixBallots() {
        move();
        while(true){
        checkRoom();
        findRoom();
        }
    }
    public void turnRight(){
        for (int i = 0; i < 3; i++){
            turnLeft();
        }
    }
    public void turnAround(){
        for (int i = 0; i < 2; i++){
            turnLeft();
        }
    }
    public void findRoom(){
        move();
        move();
    }
    public void checkRoom(){
        if(!nextToABeeper()){
            turnLeft();
            move();
            if(nextToABeeper()){
                while(nextToABeeper()){
                    pickBeeper();
                }
            }
            turnAround();
            move();
            move();
            if(nextToABeeper()){
                while(nextToABeeper()){
                    pickBeeper();
                    }
                }
            turnAround();
            move();
            turnRight();
            }
        }
    }

