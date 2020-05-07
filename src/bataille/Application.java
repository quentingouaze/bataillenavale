package bataille;

import java.util.Arrays;
import java.util.ArrayList;

import coordonnees.Coordonnees;
import coordonnees.Direction;
import coordonnees.Range;
public class Application {

    public static void main(String[] args) {
        Range battlefield= new Range (10,0,10,0);
        Bateau bateau1 = new Bateau(Direction.Down, Modele.Gros);
        System.out.println(bateau1.getDirection());
        System.out.println(bateau1.getModele());
        System.out.println((bateau1.getCoordonnees()));


        Bateau bateau2= new Bateau(Direction.Left,Modele.Petit);
        System.out.println(bateau2.getCoordonnees()); // Returns pointer, use "Arrays.toString() as previously to get value
        System.out.println(bateau2.getDirection());
        System.out.println(bateau2.getModele());
    }

    }

