package coordonnees;
import bataille.Bateau;
public class Coordonnees {

    private int x;
    private int y;
    public boolean coordonneesInRange(int x, int y){
        if(x<0||x>20||y<0||y>20){
            // Find how to use class Range to replace 0 and 20 values
            return false;
        }
        return true;
    }
    public Coordonnees(int x, int y){
        if(coordonneesInRange(x,y)){
            this.setX(x);
            this.setY(y);
        }
        else{
            System.out.println("Coordonnées hors du champ de bataille");
        }
    }
    @Override
    public String toString(){
        return "("+ x +" , "+ y+")";
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    }
