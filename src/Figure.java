import static java.lang.System.out;

public class Figure {
    private int length;
    private int width;
    private int r;

    public Figure(int length) {
        this.length = length;
        this.width = length;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getR() {
        return r;
    }

    public Figure(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void calculateTheAreaOfTheFigure() {
        System.out.println("Pole figury:" + getLength() * getWidth());
    }

    public void calculateThePerimeterOfFigure() {
        System.out.println("Obwód figury: " + (getLength() + getWidth()) * 2);
    }
}
