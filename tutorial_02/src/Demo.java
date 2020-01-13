import shapes.*;

class demo {
  public static void main (String [] args) {
    Shape myShape = new Shape();
    Rectangle myRectangle = new Rectangle();
    Square mySquare = new Square();
    Triangle myTriangle = new Triangle();

    System.out.println("The three objects right after being created:");

    System.out.println(myShape);
    System.out.println(myRectangle);
    System.out.println(mySquare);
    System.out.println(myTriangle);

    System.out.println("Let's set the heights to 5...");

    myShape.setHeight(5);
    myRectangle.setHeight(5);
    mySquare.setHeight(5);
    myTriangle.setHeight(5);

    System.out.println(myShape);
    System.out.println(myRectangle);
    System.out.println(mySquare);
    System.out.println(myTriangle);


    System.out.println("Let's set the widths to 12...");
    myShape.setWidth(12);
    myRectangle.setWidth(12);
    mySquare.setWidth(12);
    myTriangle.setWidth(12);

    System.out.println(myShape);
    System.out.println(myRectangle);
    System.out.println(mySquare);
    System.out.println(myTriangle);

    System.out.println("Let's print our Rectangle, Square and Triangle Shapes with different patterns");
    myRectangle.setPattern('@');
    myRectangle.draw();
    mySquare.setPattern('#');
    mySquare.draw();
    myTriangle.setPattern('^');
    myTriangle.draw();
  }
}

/* The expected output is as follows:
 *
 * The three objects right after being created:
 * class Shapes.Shape =>  Height: 0 Width: 0
 * class Shapes.Rectangle =>  Height: 0 Width: 0
 * class Shapes.Square =>  Height: 0 Width: 0
 * class Shapes.Triangle =>  Height: 0 Width: 0 Angle: 0
 * Let's set the heights to 5...
 * class Shapes.Shape =>  Height: 5 Width: 0
 * class Shapes.Rectangle =>  Height: 5 Width: 0
 * class Shapes.Square =>  Height: 5 Width: 5
 * class Shapes.Triangle =>  Height: 5 Width: 0 Angle: 0
 * Let's set the widths to 12...
 * class Shapes.Shape =>  Height: 5 Width: 12
 * class Shapes.Rectangle =>  Height: 5 Width: 12
 * class Shapes.Square =>  Height: 12 Width: 12
 * class Shapes.Triangle =>  Height: 5 Width: 12 Angle: 0
 * Let's print our Rectangle, Square and Triangle Shapes with different patterns
 * @@@@@@@@@@@@
 * @@@@@@@@@@@@
 * @@@@@@@@@@@@
 * @@@@@@@@@@@@
 * @@@@@@@@@@@@
 * ############
 * ############
 * ############
 * ############
 * ############
 * ############
 * ############
 * ############
 * ############
 * ############
 * ############
 * ############
 * ^
 * ^^^
 * ^^^^^
 * ^^^^^^^
 * ^^^^^^^^^
 */
