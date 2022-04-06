

public class Rectangle implements Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Czworokąt: " + length + width;
    }

    @Override
    public int calculateTheAreaOfTheFigure() {
        return width * length;
    }

    @Override
    public int calculateThePerimeterOfFigure() {
        return (length + width) * 2;
    }
}
