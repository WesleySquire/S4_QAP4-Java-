package Problem1;

import java.util.ArrayList;

public class Demo {
  public static void main(String[] args) {
    Shape s1 = new Shape("blue", false);
    Circle c1 = new Circle(12.0);
    Ellipse e1 = new Ellipse(4.2, 3.3, "yellow", false);
    Triangle t1 = new Triangle(1.2, 3.3, 3.3, "yellow", true);
    EquilateralTriangle et1 = new EquilateralTriangle();

    ArrayList<Shape> ShapeArray = new ArrayList<Shape>();

    ShapeArray.add(s1);
    ShapeArray.add(c1);
    ShapeArray.add(e1);
    ShapeArray.add(t1);
    ShapeArray.add(et1);

    for (Shape shapes : ShapeArray) {
      System.out.println(shapes.toString());
    }

  }
}
