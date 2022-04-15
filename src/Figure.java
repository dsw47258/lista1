import java.util.HashMap;

public class Figure {
    private static HashMap<FigureType, FigureFactory> dictionary = new HashMap<>();
    static {
        dictionary.put(FigureType.Square, new SquareFactory());
        dictionary.put(FigureType.Rectangle, new RectangleFactory());
        dictionary.put(FigureType.Circle, new CircleFactory());
    }



    public static IFigure createFigure(FigureType type)
    {
        return dictionary.get(type).createFigure();
    }
}
