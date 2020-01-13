package shapes;

/**
 * An right angled Triangle, which is also a Shape
 **/
public class Triangle extends Shape {
  private int angle = 90;

  /**
   * The getter for the angle
   * @return int: the angle
   **/
  public int getAngle () {
    return this.angle;
  }

  /**
   * The toString method, same as for Shape but with the angle added
   * @return String: The name of the class, the height, width and angle
   **/
  public String toString() {
    return super.toString() + " Angle: " + getAngle();
  }

  /**
   * Draw the triangle to System.out using the Shape's pattern
   **/
  public void draw() {
    int rWidth;

    for (int i=0; i < this.getHeight(); i++) {
      rWidth = i*2 + 1;   
      for (int j=0; j < rWidth; j++) {
        System.out.print(this.getPattern());
      }
      System.out.print("\n");
    }
  }
};
