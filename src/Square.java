
public class Square implements Figure {
    int side1;
    int side2;

    public Square(int side1) {
        this.side1 = side1;
        this.side2 = side1;
    }


    @Override
    public int getside1() {
        return side1;
    }

    @Override
    public int getside2() {
        return side2;
    }

    @Override
    public void min() {
        side1 /= Math.sqrt(2);
    }

    @Override
    public void max() {
        side1 *= Math.sqrt(2);
    }

    @Override
    public int calculateTheAreaOfTheFigure() {
        return Figure.super.calculateTheAreaOfTheFigure();
    }

    @Override
    public int calculateThePerimeterOfFigure() {
        return Figure.super.calculateThePerimeterOfFigure();
    }

}