import java.util.Random;

public enum FigureType {
    Square, Rectangle, Circle;

    public static FigureType generateRandomFigureType() {
        FigureType[] values = FigureType.values();
        int length = values.length;
        int randFigureType = new Random().nextInt(length);
        return values[randFigureType];
    }
}

