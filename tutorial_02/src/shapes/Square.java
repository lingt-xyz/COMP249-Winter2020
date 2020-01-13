package shapes;

/**
 * A Square, which is a Shape
 **/
public class Square extends Shape {

  /**
   * The new setter for height.
   * The height and width always remain the same.
   * @param h the new height (and width)
   **/
  public void setHeight(int h) {
    super.setHeight(h);
    super.setWidth(h);
  }

  /**
   * The new setter for width
   * The height and width always remain the same.
   * @param w the new width (and height)
   **/
  public void setWidth(int w) {
    super.setHeight(w);
    super.setWidth(w);
  }

  /**
   * Draw a Square to System.out using the Shape's pattern
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
