public class zad1 {
    public static void main(String[] args) {
      Figure square = new Square(4);
      System.out.println("Pole kwadratu: "+square.calculateTheAreaOfTheFigure());
      Figure rectangle = new Rectangle(1,3);
      System.out.println("Obwód prostokata: "+rectangle.calculateThePerimeterOfFigure());
    }
}
