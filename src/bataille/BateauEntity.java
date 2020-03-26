package bataille;

import java.util.ArrayList;
public class BateauEntity {

    private int[]startPosition=new int[2];
    private int size;
    private String direction;

    public int[] getPosition(){
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
    public void setPosition(int[] startPosition){
        this.startPosition=startPosition;
    }


}
