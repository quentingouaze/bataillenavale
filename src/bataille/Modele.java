package bataille;

public enum Modele {
    Small(1),
    Medium(2),
    Large(3);
    private int size;

    Modele(int size){
        this.size=size;
    }
    public int getSize(){
        return size;
    }
}
