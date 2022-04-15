import java.util.Random;

public class CircleFactory extends FigureFactory{
    @Override
    IFigure createFigure() {
        Random rand = new Random();
        return new Circle(rand.nextInt(100)+1);
    }
}
