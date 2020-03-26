package bataille;

import java.util.Arrays;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        Bateau bateau1 = new Bateau("up", 3,5,2);
        System.out.println(bateau1.getDirection());
        System.out.println(bateau1.getSize());
        System.out.println(Arrays.toString(bateau1.getPosition()));


        Bateau bateau2= new Bateau("down",2,4,6);
        System.out.println(bateau2.getPosition()); // Returns pointer, use "Arrays.toString() as previously to get value
        System.out.println(bateau2.getDirection());
        System.out.println(bateau2.getSize());
    }

    }

