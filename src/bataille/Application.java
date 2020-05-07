package bataille;

import java.util.Arrays;
import java.util.ArrayList;
import coordonnees.Range;
public class Application {

    public static void main(String[] args) {
        Range battlefield= new Range (10,0,10,0);
        Bateau bateau1 = new Bateau(1, 5,"gauche", 2);
        System.out.println(bateau1.getDirection());
        System.out.println(bateau1.getLength());
        System.out.println((bateau1.getPosition()));


        Bateau bateau2= new Bateau(2,4,"droite",4);
        System.out.println(bateau2.getPosition()); // Returns pointer, use "Arrays.toString() as previously to get value
        System.out.println(bateau2.getDirection());
        System.out.println(bateau2.getLength());
    }

    }

