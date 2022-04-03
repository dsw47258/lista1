public class zad1 {
    public static void main(String[] args) {
        Square s1 = new Square(5);
        Rectangle r1 = new Rectangle(3, 4);
        System.out.println(s1);
        s1.calculateTheAreaOfTheFigure();
        s1.calculateThePerimeterOfFigure();
        System.out.println(r1);
        r1.calculateTheAreaOfTheFigure();
        r1.calculateThePerimeterOfFigure();

    }
}
