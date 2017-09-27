package lab_6.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    int[] beeperList = new int[8];
    int tempCount = 0;
    int arrayNum = 0;
    public void sortBeepers() {
        goToStart();
        createArray();
        returnToStart();
        //sortArrayMax();
        //returnToStart();
        //createArray();
        sortArrayMin();
        buildArray();
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
    public void goToStart(){
        move();
        faceSouth();
        while(frontIsClear()){
            move();
        }
        faceNorth();
    }
    public void createArray(){
        if(nextToABeeper()){
            faceNorth();
            while(nextToABeeper()){
                pickBeeper();
                tempCount++;
                move();
            }
            faceSouth();
            beeperList[arrayNum] = tempCount;
            while(frontIsClear()){
                move();
            }
            faceEast();
            move();
            arrayNum++;
            tempCount = 0;
            createArray();
        }
        getBeeperList();
    }
    public int[] getBeeperList() {
        //This will be used to print the beepers found.  No need to modify.
        return beeperList;
    }
    public void returnToStart(){
        faceWest();
        while(frontIsClear()){
            move();
        }
        faceNorth();
    }
    public void sortArrayMax(){
        int maxValue = 0;
        int maxValueIndex = 0;
        for(int i = 0; i < beeperList.length; i++){
            if(beeperList[i] > maxValue){
                maxValue = beeperList[i];
                maxValueIndex = i;
            }
        }
        beeperList[maxValueIndex] = 0;
        faceNorth();
        while(maxValue > 0){
            putBeeper();
            move();
            maxValue--;
        }
        faceSouth();
        while(frontIsClear()){
            move();
        }
        faceEast();
        move();
        sortArrayMax();
    }
    public int[] sortedList =  { 0,0,0,0,0,0,0,0 };
    public void sortArrayMin(){
        for(int k = 0; k < beeperList.length; k++){
            int minValue = 100;
            int minValueIndex = 0;
            for(int i = 0; i < beeperList.length; i++){
                if(beeperList[i] < minValue && beeperList[i] > (-1)){
                    minValue = beeperList[i];
                    sortedList[k] = beeperList[i];
                    minValueIndex = i;
                }
            }
            beeperList[minValueIndex] = -1;
        }
        System.out.println("Sorted: ");
        for (int j = 0; j < sortedList.length; j++) {
               System.out.print(sortedList[j] + ", ");
        }
    }
    public void buildArray(){
        for(int p = 0; p < sortedList.length; p++) {
           faceNorth();
           while(sortedList[p] > 0){
               putBeeper();
               move();
               sortedList[p]--;
            }
           faceSouth();
           while(frontIsClear()){
               move();
           }
           faceEast();
           move();
        }
    }
}

