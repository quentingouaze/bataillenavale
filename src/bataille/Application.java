package bataille;

import java.util.Arrays;
import java.util.ArrayList;

import coordonnees.Coordonnees;
import coordonnees.Direction;
import coordonnees.Range;
public class Application {

    public static void main(String[] args) {
        Range battlefield= new Range (10,0,10,0);
        Coordonnees c= new Coordonnees(4,8);
        Bateau bateau1 = new Bateau(c,Direction.Down, Modele.Small, battlefield);
        System.out.println(bateau1.getDirection());
        System.out.println(bateau1.getModele());
        System.out.println((bateau1.getCoordonnees()));

        Coordonnees d= new Coordonnees(8,8);
        Bateau bateau2= new Bateau(d,Direction.Left,Modele.Large, battlefield);
        System.out.println(bateau2.getDirection());
        System.out.println(bateau2.getModele());
        System.out.println(bateau2.getCoordonnees());

    }
    }

