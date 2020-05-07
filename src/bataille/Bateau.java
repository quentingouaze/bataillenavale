package bataille;

import java.util.ArrayList;
import coordonnees.Coordonnees;
import coordonnees.Direction;
public class Bateau {
    private Coordonnees coordonnees;
    private Direction direction;
    private Modele modele;
    public Bateau (Direction direction, Modele modele){
     //this.coordonnees=coordonnees;
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