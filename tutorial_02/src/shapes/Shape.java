package shapes;
/**
 * @author Felix-Herve Bachand <f_bachan@encs.concordia.ca>
 * @version 0.1
 **/
public class Shape {
  private int height = 0;
  private int width = 0;
  private char pattern = '*';

  /**
   *  Default constructor
   **/
  public Shape() {
    this.height = 0;
    this.width = 0;
  }

  /**
   * Constructor
   * @param h height of a Shape
   * @param w width of a Shape
   **/
  public Shape(int h, int w) {
    this.height = h;
    this.width = w;
  }

  /**
   * Setter for the height
   * @param h the height
   **/
  public void setHeight(int h) {
    this.height = h;
  }

  /**
   * Setter for the width
   * @param w the width
   **/
  public void setWidth(int w) {
    this.width = w;
  }

  /**
   * Setter for the pattern
   * @param c the char to use
   **/
  public void setPattern(char c) {
    this.pattern = c;
  }

  /**
   * Getter for height
   * @return int: the height
   **/
  public int getHeight() {
    return this.height;
  }

  /**
   * Getter for the width
   * @return int: the width
   **/
  public int getWidth() {
    return this.width;
  }

  /**
   * Getter for the pattern
   * @return the char to use when drawing the Shape
   **/
  public char getPattern() {
    return this.pattern;
  }

  /**
   * Overloading the default toString method
   * @return String: the class name, the Shape's height and width
   **/
  public String toString() {
    return getClass() + " =>  Height: " + getHeight() + " Width: " + getWidth();
  }
}
