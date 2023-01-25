package Problem2;

import java.util.ArrayList;

public class Demo {
  public static void main(String[] args) {

    circle c1 = new circle(12.0);
    ellipse e1 = new ellipse(4.2, 3.3);
    triangle t1 = new triangle(1.2, 3.3, 3.3);
    equilateralTriangle et1 = new equilateralTriangle();

    ArrayList<shape> ShapeArray = new ArrayList<shape>();

    ShapeArray.add(c1);
    ShapeArray.add(e1);
    ShapeArray.add(t1);
    ShapeArray.add(et1);

    for (shape shapes : ShapeArray) {
      System.out.println(shapes.toString());
      shapes.ScaleUp(7);
      System.out.println(shapes.toString());
      shapes.ScaleDown(0.4);
      System.out.println(shapes.toString());
    }
  }
}
