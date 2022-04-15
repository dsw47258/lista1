import java.util.Random;

public class RectangleFactory extends FigureFactory {
    @Override
    IFigure createFigure() {
        Random rand = new Random();
        return new Rectangle(rand.nextInt(100) + 1, rand.nextInt(100) + 1);
    }
}
