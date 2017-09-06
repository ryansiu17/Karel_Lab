package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        if(facingEast() && frontIsClear()){
            moveToRoom();
            checkRoom();
            carpetRooms();
        }
        else{
            turnOff();
        }
    }
    // Preconditions, must be facing East,
    // 1 ave from room entry and on lowest street
    public void moveToRoom(){
        move();
        turnLeft();
        move();
    }
    //must be in room 1st level facing North
    public void checkRoom(){
        turnLeft();
        //checks left wall
        if(!frontIsClear()){
            turnLeft();
            turnLeft();
            //checks right wall
            if(!frontIsClear()){
                turnLeft();
                //checks front wall, otherwise moves forwards and checks sides
                if(!frontIsClear()){
                    putBeeper();
                    exitRoom();
                }
                else{
                    move();
                    checkRoom();
                }
            }
            else{
                exitRoom();
            }
        }
        else{
            exitRoom();
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void exitRoom(){
        faceSouth();
        if (frontIsClear()){
            move();
            exitRoom();
        }
        else{
            turnLeft();
        }
    }
    public void faceSouth(){
        if (facingWest()){
            turnLeft();
        }
        else{
            if (facingNorth()){
                turnLeft();
                turnLeft();
            }
            else{
                if (facingEast()){
                    turnRight();
                }
            }
        }
    }
}

