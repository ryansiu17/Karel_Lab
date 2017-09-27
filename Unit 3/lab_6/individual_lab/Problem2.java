package lab_6.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public int beepers = 0;
    public void buildFence() {
        findBeepers();
        findBox();
        buildWall();
    }
    public void faceEast(){
        while(!facingEast()){
            turnLeft();
        }
    }
    public void faceWest(){
        while(!facingWest()){
            turnLeft();
        }
    }  
    public void faceSouth(){
        while(!facingSouth()){
            turnLeft();
        }
    }
    public void faceNorth(){
        while(!facingNorth()){
            turnLeft();
        }
    }
    public void findBeepers(){
        faceWest();
        while(frontIsClear()){
            move();
        }
        faceNorth();
        while(!nextToABeeper()){
            move();
        }
        while(nextToABeeper()){
            pickBeeper();
            beepers++;
        }
        faceWest();
    }
    public void findBox(){
        boolean boxFound = false;
        while(!boxFound){
            faceNorth();
            if(!frontIsClear()){
                boxFound = true;
            }
            else{
                faceEast();
                move();
            }
        }
    }
    public void buildWall(){
        while(beepers > 0){
            faceNorth();
            if(!frontIsClear()){
                putBeeper();
                beepers--;
                faceEast();
                move();
            }
            else{
                putBeeper();
                beepers--;
                faceNorth();
                move();
                while(beepers > 0){
                    faceWest();
                    if(!frontIsClear()){
                        putBeeper();
                        beepers--;
                        faceNorth();
                        move();
                    }
                    else{
                        putBeeper();
                        beepers--;
                        faceWest();
                        move();
                        while(beepers > 0){
                            faceSouth();
                            if(!frontIsClear()){
                                putBeeper();
                                beepers--;
                                faceWest();
                                move();
                            }
                            else{
                                putBeeper();
                                beepers--;
                                faceSouth();
                                move();
                            }
                        }
                    }
                }
            }
        }
    }
}

