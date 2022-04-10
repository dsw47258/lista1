public class test {
    public static void main(String[] args) {
        Figure square = new Square(5);
        System.out.println("Pole kwadratu: " + square.calculateTheAreaOfTheFigure());
        System.out.println("Obwód kwadratu:" + square.calculateThePerimeterOfFigure());
        square.max();
        System.out.println("Powiększone pole kwadratu: " + square.calculateTheAreaOfTheFigure());
        square.min();
        System.out.println("Pomniejszone pole kwadratu: " + square.calculateTheAreaOfTheFigure());

        Figure rectangle = new Rectangle(5, 3);
        System.out.println("Pole prostokąta: " + rectangle.calculateTheAreaOfTheFigure());
        System.out.println("Obwód prostokata: " + rectangle.calculateThePerimeterOfFigure());
        rectangle.max();
        System.out.println("Pomniejszone pole prostokąta: " + rectangle.calculateTheAreaOfTheFigure());
        rectangle.min();
        System.out.println("Powiększone pole prostokąta: " + rectangle.calculateTheAreaOfTheFigure());


        Figure wheel = new Wheel(3);
        System.out.println("Pole koła: " + wheel.calculateTheAreaOfTheFigure());
        System.out.println("Obwód koła: " + wheel.calculateThePerimeterOfFigure());
        wheel.max();
        System.out.println("Pomniejsozne pole koła: " + wheel.calculateTheAreaOfTheFigure());
        wheel.min();
        System.out.println("Powiększone pole koła: " + wheel.calculateTheAreaOfTheFigure());

    }
}
