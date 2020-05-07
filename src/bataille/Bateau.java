package bataille;

import java.util.ArrayList;
import coordonnees.Coordonnees;
public class Bateau {
    private Coordonnees startPosition;
    private String direction;
    public Bateau (int x, int y, String direction, int length){
        setPosition(new Coordonnees(x,y));
        setDirection(direction);;
        setLength(length);
    }
    private int length;
    public void setDirection(String direction) {
        this.direction = direction;
    }
    public void setPosition(Coordonnees coordonnees){
        this.startPosition = coordonnees;
    }
    public Coordonnees getPosition() {
        return startPosition;
    }
    public String getDirection() {
        return direction;
    }
    public void setLength(int length){
        this.length=length;
    }
    public int getLength(){
        return length;
    }
}