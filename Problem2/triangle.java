package Problem2;

public class triangle extends shape implements scaleable {
  protected Double side1, side2, side3;

  triangle() {
    super();
    this.side1 = 1.0;
    this.side2 = 1.0;
    this.side3 = 1.0;
  }

  triangle(Double side1, Double side2, Double side3) {
    super();
    final int condition;
    if ((side1 + side2 > side3) && (side3 + side2 > side1) && (side3 + side1 > side2)) {
      condition = 1;
    } else {
      condition = 2;
    }

    switch (condition) {
      case 1:
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        break;

      default:
        System.out.println("ERROR - improper sides of a triangle");
        System.exit(0);
        break;
    }

  }

  public Double Area() {
    final Double s = (side1 + side2 + side3) / 2;
    final Double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    return area;
  }

  public Double getSide1() {
    return side1;
  }

  public Double getSide2() {
    return side2;
  }

  public Double getSide3() {
    return side3;
  }

  public void setSide1(Double side1) {
    this.side1 = side1;
  }

  public void setSide2(Double side2) {
    this.side2 = side2;
  }

  public void setSide3(Double side3) {
    this.side3 = side3;
  }

  public void ScaleUp(int ratio) {
    System.out.println("Scale up by a factor of " + ratio);
    this.side1 = this.side1 * ratio;
    this.side2 = this.side2 * ratio;
    this.side3 = this.side3 * ratio;
  }

  @Override
  public void ScaleDown(Double ratio) {
    System.out.println("Scale down by a factor of " + ratio);
    this.side1 = this.side1 * ratio;
    this.side2 = this.side2 * ratio;
    this.side3 = this.side3 * ratio;

  }

  @Override
  public String toString() {
    return "A Triangle with the sides " + this.side1 + ", " + this.side2 + ", " + this.side3 + " and an area = "
        + this.Area();
  }
}
