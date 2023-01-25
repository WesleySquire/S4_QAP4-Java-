package Problem2;

// equilateralTriangle

public class equilateralTriangle extends triangle implements scaleable {
  protected Double side1, side2, side3;

  equilateralTriangle() {
    super();
    this.side1 = 1.0;
    this.side2 = 1.0;
    this.side3 = 1.0;
  }

  equilateralTriangle(Double side1, Double side2, Double side3) {
    super();
    final int condition;
    if ((side1 == side2) && (side3 == side2) && (side3 == side1)) {
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
        System.out.println("ERROR - improper sides of an Equilateral Triangle");
        System.exit(0);
        break;
    }

  }

  public Double Area() {
    final Double s = (side1 + side2 + side3) / 2;
    final Double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    // Rounds decimal numbers
    return Math.round(area * 100) / 100D;
  }

  public void ScaleUp(int ratio) {
    System.out.println("Scale up by a factor of " + ratio);
    this.side1 = this.side1 * ratio;
    this.side2 = this.side2 * ratio;
    this.side3 = this.side3 * ratio;
  }

  public void ScaleDown(Double ratio) {
    System.out.println("Scale down by a factor of " + ratio);
    this.side1 = this.side1 * ratio;
    this.side2 = this.side2 * ratio;
    this.side3 = this.side3 * ratio;

  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "An equilateral triangle with the sides " + this.side1 + ", " + this.side2 + ", " + this.side3
        + " and an area = "
        + this.Area();
  }

}
