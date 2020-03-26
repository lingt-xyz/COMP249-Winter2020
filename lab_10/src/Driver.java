import java.util.Random;

/**
 * Create a driver class where you will create an array of Fillable objects, and initialize 2
 * circles and 3 rectangles (you may hardcode the shapes’ coordinates with valid values during
 * the instantiation). Then, test your program by iterating through the array to draw and fill each
 * of the shapes with random colors.
 *
 * @author Ling
 * @version 2020 Winter semester
 * @Date 2020-March-26
 */
public class Driver {
    public static void main(String[] args) {
        Fillable[] objects = new Fillable[]{
                new Circle(1.1,1.2,1.3),
                new Circle(2.2,2.3,2.4),
                // notice that the following not actually rectangles
                new Rectangle(1.1,1.2,2.3,2.4),
                new Rectangle(2.2,2.3,3.3,3.4),
                new Rectangle(3.3,3.4,4.5,4.6)
        };

        Random r = new Random();
        for(Fillable o : objects){
            int color = r.nextInt(5)+1;
            o.fill(color);
            o.draw(color);
        }
    }
}
