

public interface IFigure {
    double getSide1();

    double getSide2();

    void min();

    void max();

    default double calculateTheAreaOfTheFigure() {
        return getSide1() * getSide2();
    }

    default double calculateThePerimeterOfFigure() {
        return (getSide1() + getSide2()) * 2;
    }

}
