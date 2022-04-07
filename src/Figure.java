

public interface Figure {
    int getside1();

    int getside2();

    void min();

    void max();

    default int calculateTheAreaOfTheFigure() {
        return getside1() * getside2();
    }

    default int calculateThePerimeterOfFigure() {
        return (getside1() + getside2()) * 2;
    }

}
