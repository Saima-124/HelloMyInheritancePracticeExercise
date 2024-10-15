import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    public double getArea(){
        return getWidth()*getHeight();
    }
    public double getPerimeter(){
        return 2*(getWidth()+getHeight());
    }
    public String toString(){
        return "BetterRectangle [x=" + getX() + ", y=" + getY() + ", width=" + getWidth() + ", height=" + getHeight() + ", area=" +getArea() + ", perimeter=" + getPerimeter() + "}";
    }
}
