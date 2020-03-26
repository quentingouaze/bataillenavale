package bataille;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        BateauEntity bateau1 = new BateauEntity();
            bateau1.setSize(2);
            int[] pos=new int[2];
            pos[0]=1;
            pos[1]=4;
            bateau1.setPosition(pos);
            bateau1.setDirection("up");
        }
    }
}
