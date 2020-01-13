package shapes;

/**
 * A Rectangle, which is a Shape
 **/
public class Rectangle extends Shape {
  /**
   * Draw a Rectangle to System.out using the Shape's pattern
   **/
  public void draw() {
    for (int i=0; i < this.getHeight(); i++) {
      for (int j=0; j < this.getWidth(); j++) {
        System.out.print(this.getPattern());
      }
      System.out.print("\n");
    }
  }
}
