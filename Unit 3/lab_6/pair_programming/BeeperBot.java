package lab_6.pair_programming;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    //instance variable to store beeper count
    int[] beeperList = new int[13];
    int tempCount = 0;
    int arrayNum = 0;
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAndCountBeepers() {
        move();
        for(int i = 0; i < 13; i++){
            if(nextToABeeper()){
                faceNorth();
                while(nextToABeeper()){
                    pickBeeper();
                    tempCount++;
                    move();
                }
                returnDown();
                beeperList[arrayNum] = tempCount;
                move();
            }
            else{
                move();
                beeperList[arrayNum] = 0;
            }
            arrayNum++;
            tempCount = 0;
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
    public void faceEast(){
        while(!facingEast()){
            turnLeft();
        }
    }
    public void returnDown(){
        faceSouth();
        while(frontIsClear()){
            move();
        }
        faceEast();
    }
    public int[] getBeeperList() {
            //This will be used to print the beepers found.  No need to modify.
            return beeperList;
    }
   
}

