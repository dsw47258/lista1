
public class Square implements Figure {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Kwadrat:" + length;
    }

    @Override
    public int calculateTheAreaOfTheFigure() {
        return length * length;
    }

    @Override
    public int calculateThePerimeterOfFigure() {

        return length * 4;
    }
}
