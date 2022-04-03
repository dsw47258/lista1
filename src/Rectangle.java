import static java.lang.System.*;

public class Rectangle extends Figure {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public String toString() {
        return "Czworokąt: " + getLength() + getWidth();
    }
}
