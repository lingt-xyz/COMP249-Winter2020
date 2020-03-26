public class Rectangle implements Fillable {
    // Double x1, y1, x2, y2
    double x1, y1, x2, y2;

    private static final String FilePath = "rectangle.txt";

    /**
     * A Constructor that takes four double variables and sets those values to x1, y1, x2, and y2 respectively
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    Rectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Override the draw(int color) method that prints out the following message to a .txt file: “Rectangle drawn with
     * upper-left corner at (x1, y1) and lower-right corner at (x2, y2), and color c”, where x1, y1, x2, y2, and c refers
     * to the variables x1, y1, x2, y2, and color respectively
     *
     * @param color
     */
    @Override
    public void draw(int color) {
        Writer.AppendToFile(FilePath, "Rectangle drawn with upper-left corner at (" + x1 + ", " + y1 + ") and lower-right corner at (" + x2 + ", " + y2 + "), and color " + color);
    }

    /**
     * Override the fill(int color) method that prints out the following message to a .txt file: “Rectangle filled with
     * upper-left corner at (x1, y1) and lower-right corner at (x2, y2), and color c”, where x1, y1, x2, y2, and c refers
     * to the variables x1, y1, x2, y2, and color respectively
     *
     * @param color
     */
    @Override
    public void fill(int color) {
        Writer.AppendToFile(FilePath, "Rectangle filled with upper-left corner at (" + x1 + ", " + y1 + ") and lower-right corner at (" + x2 + ", " + y2 + "), and color " + color);
    }

}
