package bataille;
import coordonnees.Range;
import coordonnees.Coordonnees;
import coordonnees.Direction;
public class Bateau {
    private Coordonnees coordonnees;
    private Direction direction;
    private Modele modele;
    public Bateau (Coordonnees coordonnees,Direction direction, Modele modele, Range battlefield){
       if (coordonnees.getX()>battlefield.getxMax()|| coordonnees.getX()<battlefield.getxMin()|| coordonnees.getY()<battlefield.getyMin()|| coordonnees.getY()>battlefield.getyMax()){
           System.out.println("Start position NOPE");
       }
       else{
           System.out.println("Start Position OK");
       }
     this.coordonnees=coordonnees;
     this.modele=modele;
     this.direction=direction;
    }
    public Direction getDirection() {
        return direction;
    }
    public Modele getModele() {
        return modele;
    }
    public Coordonnees getCoordonnees() {
        return coordonnees;
    }
}