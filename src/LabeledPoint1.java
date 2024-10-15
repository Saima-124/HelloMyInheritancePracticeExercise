import java.awt.Point;
public class LabeledPoint1 {
    private Point location;
    private String label;

    public LabeledPoint1(int x,int y,String label) {
        location = new Point(x,y);
        this.label = label;
    }
    public String toString(){
        return "LabeledPoint{" + "location" + location.toString() + ",lebel='" + label + '\'' + '}';
    }
}
