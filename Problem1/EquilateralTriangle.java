package Problem1;

class EquilateralTriangle extends Shape {
  protected Double side1, side2, side3;

  public EquilateralTriangle() {
    super();
    this.side1 = 1.0;
    this.side2 = 1.0;
    this.side3 = 1.0;
  }

  public EquilateralTriangle(Double side1, Double side2, Double side3) {
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

  public EquilateralTriangle(Double side1, Double side2, Double side3, String color, Boolean filled) {
    super(color, filled);
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
        System.out.println("ERROR - improper sides of a Equilateral Triangle");
        System.exit(0);
        break;
    }

  }

  // Getters

  public Double getArea() {
    final Double s = (side1 + side2 + side3) / 2;
    final Double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    // Rounds decimal numbers
    return Math.round(area * 100) / 100D;
  }

  public Double getPerimeter() {
    final Double perimeter;
    perimeter = side1 + side2 + side3;

    // Rounds decimal numbers
    return Math.round(perimeter * 100) / 100D;
  }

  @Override
  public String toString() {
    return "An equilateral Triangle with an area = " + this.getArea() + " and a perimeter = " + this.getPerimeter()
        + " is "
        + super.toString();
  }
}
