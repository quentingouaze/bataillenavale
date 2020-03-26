package bataille;

import java.util.ArrayList;
public class Bateau{

    private int[]startPosition=new int[2];
    private int size;
    private String direction;

    public  Bateau(String direction, int size,int x, int y){
        int position[]= new int[2];
        position[0]=x;
        position[1]=y;
        this.startPosition=position;
        this.size=size;
        this.direction=direction;
    }

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
