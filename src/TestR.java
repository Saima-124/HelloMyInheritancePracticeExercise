public class TestR {
    public static void main(String[] args) {
        BetterRectangle b = new BetterRectangle(10,20,30,40);
        System.out.println(b);
        System.out.println("Area is " + b.getArea());
        System.out.println("Perimeter is " + b.getPerimeter());
    }
}
