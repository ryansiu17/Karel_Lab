 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    int numbeepers = 0;
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        checkPile();
        decide();
    }
    public void checkPile(){
        while(nextToABeeper()){
            pickBeeper();
            numbeepers++;
        }
    }
    public void decide(){
        if (numbeepers % 2 == 0){
            goEast();
        }
        else{
            goWest();
        }
    }
    public void goEast(){
        while(!facingEast()){
            turnLeft();
        }
        move();
    }
    public void goWest(){
        while(!facingWest()){
            turnLeft();
        }
        move();
    }    
   
}

