package bataille;

import java.util.ArrayList;

public class BateauEntity {

    private ArrayList<Integer> startPosition;
    private int size;
    private String direction;

    public ArrayList<Integer> getPosition(){
        return startPosition;
    }
    public int getSize(){
        return size;
    }
    public String getDirection(){
        return direction;
    }

    public void setDirection(String direction){
        this.direction=direction;
    }
    public void setSize(int size){
        this.size=size;
    }
    public void setPosition(ArrayList<Integer> startPosition){
        this.startPosition=startPosition;
    }

}
