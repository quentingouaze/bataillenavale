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



}
