import static java.lang.Math.*;

public class Square extends Figure {
    public Square(int length) {
        super(length);
    }

    @Override
    public String toString() {
        return "Kwadrat:" + getLength();
    }
}
