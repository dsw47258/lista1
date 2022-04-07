public class Wheel implements Figure {
    private double r;

    public Wheel(int r) {
        this.r = r;
    }

    @Override
    public int getside1() {
        return (int) r;
    }

    @Override
    public int getside2() {
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
    public int calculateTheAreaOfTheFigure() {
        return (int) (Math.PI * r * r);
    }

    @Override
    public int calculateThePerimeterOfFigure() {
        return (int) (2 * Math.PI * r);

    }
}
