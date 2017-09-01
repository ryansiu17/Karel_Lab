package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * RYan Siu :
 * Dappel :
 * 8/30/17:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
        repositionToPlace();
        placeTwoRows();
        placeTwoRows();
        placeTwoRows();
        //returnToStart();//Complete this method, using the methods you create below so that all rows are harvested
    }
    /**
     * Code is for the people
     * like communism
     * 
     * Precondition: Facing East. 1 Block from beepers
     * 
     * Postcondition: Facing East. 1 Block from beepers. 2 Streets up from Precond.
     */
    public void harvestTwoRows() {
    harvestOneRow();
    repositionRight();
    harvestOneRow();
    repositionLeft();
    }
    public void harvestOneRow(){
    pickMove();
    pickMove();
    pickMove();
    pickMove();
    pickMove();
    }
    public void repositionRight(){
    move();
    turnLeft();
    move();
    turnLeft();
    }
    public void repositionLeft(){
    move();
    turnRight();
    move();
    turnRight();
    }
    public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
    }   
    public void pickMove(){
    move();
    pickBeeper();
    }
    public void placeMove(){
    move();
    putBeeper();
    }
    /**
     * Pre: Facing east 1 block from past beeper space
     * Post: Facing east 1 block from past beeper space down 2 streets
     */
    public void repositionToPlace(){
    turnRight();
    move();
    turnLeft();
    }
    public void placeOneRow(){
    placeMove();
    placeMove();
    placeMove();
    placeMove();
    placeMove();
    }
    public void placeTwoRows(){
    placeOneRow();
    repositionLeft();
    placeOneRow();
    repositionRight();
    }
}

