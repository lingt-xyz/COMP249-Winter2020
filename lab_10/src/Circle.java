/**
 * Class Circle that implements Fillable
 *
 * @author Ling
 * @version 2020 Winter semester
 * @Date 2020-March-26
 */
public class Circle implements Fillable {
    // Double x, y, radius
    double x, y, radius;

    private static final String FilePath = "circle.txt";

    /**
     * A Constructor that takes three double variables and sets those values to x, y, and radius respectively
     *
     * @param x
     * @param y
     * @param radius
     */
    Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * Override the draw(int color) method that prints out the following message to a .txt file: “Circle drawn at (x, y)
     * with radius r, and color c”, where x, y, r, c refers to the variables x, y, radius, and color respectively
     *
     * @param color
     */
    @Override
    public void draw(int color) {
        Writer.AppendToFile(FilePath, "Circle drawn at (" + x + ", " + y + ")  with radius " + radius + ", and color " + color);
    }

    /**
     * Override the fill(int color) method that prints out the following message to a .txt file: “Circle filled at (x, y)
     * with radius r, and color c”, where x, y, r, c refers to the variables x, y, radius, and color respectively
     *
     * @param color
     */
    @Override
    public void fill(int color) {
        Writer.AppendToFile(FilePath, "Circle filled at (" + x + ", " + y + ")  with radius " + radius + ", and color " + color);
    }
}
