import java.util.Random;

public class SquareFactory extends FigureFactory {
    @Override
    IFigure createFigure() {
        Random rand = new Random();
        return new Square(rand.nextInt(100)+1);
    }
}
