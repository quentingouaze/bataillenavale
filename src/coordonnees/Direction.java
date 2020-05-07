package coordonnees;

public enum Direction {
    Right("R"),
    Left("L"),
    Up("U"),
    Down("D");
    private String direction;

    Direction(String direction){
        this.direction=direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
