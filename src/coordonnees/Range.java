package coordonnees;

public class Range {
    public Range(int xMax,int xMin, int yMax, int yMin){
        setXMax(xMax);
        setXMin(xMin);
        setYMax(yMax);
        setYMin(yMin);
    }
    public int xMax;
    public int xMin;
    public int yMax;
    public int yMin;
    public void setXMax(int xMax){
        this.xMax=xMax;
    }
    public void setXMin(int xMin){
        this.xMin=xMin;
    }
    public void setYMax(int yMax){
        this.yMax=yMax;
    }
    public void setYMin(int yMin){
        this.yMin=yMin;
    }
    public int getxMax(){
        return xMax;
    }
    public int getxMin(){
        return xMin;
    }
    public int getyMax(){
        return yMax;
    }
    public int getyMin(){
        return yMin;
    }
}
