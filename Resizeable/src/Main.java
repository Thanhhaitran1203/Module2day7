
public class Main {
    public static void main(String[] args) {
    Shape[] shape = new Shape[3];
    shape[0] = new Circle (3);
    shape[1] = new Rectangle (4,6);
    shape[2] = new Square (4);

    Circle c = (Circle)shape[0] ;
    Rectangle r = (Rectangle)shape[1];
    Square s = (Square)shape[2];


        System.out.println (c.getArea ());
        System.out.println (r.getArea ());
        System.out.println (s.getArea ());
        System.out.println ("Dien tich sau khi tang");
        c.resize (Math.random ()*100);
        r.resize (Math.random ()*100);
        s.resize (Math.random ()*100);
        System.out.println (c.getArea ());
        System.out.println (r.getArea ());
        System.out.println (s.getArea ());
    }
}