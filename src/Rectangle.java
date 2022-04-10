

public class Rectangle implements Figure {
    double side1;
    double side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getSide1() {
        return side1;
    }

    @Override
    public double getSide2() {
        return side2;
    }

    @Override
    public void min() {
        side1 /= Math.sqrt(2);
        side2 /= Math.sqrt(2);
    }

    @Override
    public void max() {
        side1 *= Math.sqrt(2);
        side2 *= Math.sqrt(2);
    }


    @Override
    public double calculateTheAreaOfTheFigure() {
        return Figure.super.calculateTheAreaOfTheFigure();
    }

    @Override
    public double calculateThePerimeterOfFigure() {
        return Figure.super.calculateThePerimeterOfFigure();
    }

}
