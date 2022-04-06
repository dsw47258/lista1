public class zad1 {
    public static void main(String[] args) {
        Figure kwadrat = new Square(3);
        System.out.println("Obwód kwadratu: " + kwadrat.calculateThePerimeterOfFigure());
        System.out.println("Pole kwadratu: " + kwadrat.calculateTheAreaOfTheFigure());
        Figure prostokat = new Rectangle(4, 6);
        System.out.println("Obwód prostokątu: " + prostokat.calculateThePerimeterOfFigure());
        System.out.println("Pole prostokątu: " + prostokat.calculateTheAreaOfTheFigure());

    }
}
