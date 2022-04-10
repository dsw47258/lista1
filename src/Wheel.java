public class Wheel implements Figure {
    private double r;

    public Wheel(int r) {
        this.r = r;
    }

    @Override
    public double getSide1() {
        return (int) r;
    }

    @Override
    public double getSide2() {
        return 0;
    }

    @Override
    public void min() {
        r /= Math.sqrt(2);
    }

    @Override
    public void max() {
        r *= Math.sqrt(2);
    }

    @Override
    public double calculateTheAreaOfTheFigure() {
        return (int) (Math.PI * r * r);
    }

    @Override
    public double calculateThePerimeterOfFigure() {
        return (int) (2 * Math.PI * r);

    }
}
