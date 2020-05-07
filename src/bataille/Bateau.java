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
               switch (direction){
                   case Down:
                       if((coordonnees.getY()-modele.getSize())<battlefield.getyMin()){
                           System.out.println("Coordonnées Y min invalides");
                       }else{
                           System.out.println("Coordonnées valides");
                           this.createBateau(coordonnees,modele,direction);
                       }
                       break;
                   case Left:
                       if((coordonnees.getX()-modele.getSize())<battlefield.getxMin()){
                           System.out.println("Coordonnées X min Invalides");
                       }else{
                           System.out.println("Coordonnées valides");
                           this.createBateau(coordonnees,modele,direction);
                       }
                       break;
                   case Up:
                       if((coordonnees.getY()+modele.getSize())>battlefield.getyMax()){
                           System.out.println("Coordonnées Y max Invalides");
                       }else{
                           System.out.println("Coordonnées valides");
                           this.createBateau(coordonnees,modele,direction);
                       }
                       break;
                   case Right:
                       if((coordonnees.getX()+modele.getSize())>battlefield.getxMax()){
                           System.out.println("Coordonnées X max Invalides");
                       }else{
                           System.out.println("Coordonnées valides");
                           this.createBateau(coordonnees,modele,direction);
                       }
                       break;
               }
       }

    }
    private void createBateau(Coordonnees coordonnees, Modele modele, Direction direction){
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