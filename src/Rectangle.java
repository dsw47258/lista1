

public class Rectangle implements Figure {
    int side1;
    int side2;
    public  Rectangle (int side1, int side2) {
        this.side1=side1;
        this.side2=side2;
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
    public int calculateTheAreaOfTheFigure() {
        return Figure.super.calculateTheAreaOfTheFigure();
    }

    @Override
    public int calculateThePerimeterOfFigure() {
        return Figure.super.calculateThePerimeterOfFigure();
    }

}
