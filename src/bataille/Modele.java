package bataille;

public enum Modele {
    Petit(1),
    Moyen(2),
    Gros(3);
    private int size;

    Modele(int size){
        this.size=size;
    }
    public int getSize(){
        return size;
    }
}
