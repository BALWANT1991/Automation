package Constructors;

public class Rectangle {

  private int width;
  private int height;

  // Constructor Overload 1
  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  // Constructor Overload 2
  public Rectangle(int side) {
    this.width = side;
    this.height = side;
  }

  public static void main(String[] args) {
    // Constructor with width and height
    Rectangle rec = new Rectangle(10, 20);
    System.out.println(rec.width * rec.height); // 200

    // Constructor with width (square)
    Rectangle squ = new Rectangle(5);
    System.out.println(squ.width * squ.height); // 25
  }
}
