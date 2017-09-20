 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    int clue = 0;
    public void findTreasure() {
        lookForClue();
        checkClue();
    }
    public void lookForClue(){
        while(frontIsClear() && (!nextToABeeper())){
            move();
            if (!frontIsClear()){
                turnLeft();
            }
        }
    }
    public void checkClue(){
        while(nextToABeeper()){
            pickBeeper();
            clue++;
            System.out.println(clue);
        }
        if(clue == 1){
            faceNorth();
            clue = 0;
        }
        else{
            if(clue == 2){
                faceEast();
                clue = 0;
            }
            else{
                if(clue == 3){
                    faceSouth();
                    clue = 0;
                }
                else{
                    if (clue == 4){
                        faceWest();
                        clue = 0;
                    }
                    else{
                        System.out.println("treasure found");
                        clue = 0;
                        turnOff();
                    }
                }
            }
        }
        findTreasure();
    }
    public void faceEast(){
        while(!facingEast()){
            turnLeft();
        }
    }
    public void faceNorth(){
        while(!facingNorth()){
            turnLeft();
        }
    }
    public void faceSouth(){
        while(!facingSouth()){
            turnLeft();
        }
    }
    public void faceWest(){
        while(!facingWest()){
            turnLeft();
        }
    }
}

