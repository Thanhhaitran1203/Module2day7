
public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle (3);
        shape[1] = new Rectangle (4,6);
        shape[2] = new Square (4);
        for (Shape typeShape: shape) {
            System.out.println (typeShape.getArea ());
          if(typeShape instanceof Square){
              System.out.println (((Square) typeShape).getArea ());
            ((Square) typeShape).howToColor ();
          }
        }
    }
}