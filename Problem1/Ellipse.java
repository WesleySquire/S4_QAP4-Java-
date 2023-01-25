package Problem1;

class Ellipse extends Shape {
  protected Double axisA, axisB;

  public Ellipse() {
    super();
    this.axisA = 1.0;
    this.axisB = 1.0;
  }

  public Ellipse(Double axis1, Double axis2) {
    super();
    final int condition;
    if (axis1 > axis2) {
      condition = 1;
    } else {
      condition = 2;
    }

    switch (condition) {
      case 1:
        this.axisA = axis1;
        this.axisB = axis2;
        break;

      default:
        this.axisA = axis2;
        this.axisB = axis1;
        break;
    }

  }

  public Ellipse(Double axis1, Double axis2, String color, Boolean filled) {
    super(color, filled);
    final int condition;
    if (axis1 > axis2) {
      condition = 1;
    } else {
      condition = 2;
    }

    switch (condition) {
      case 1:
        this.axisA = axis1;
        this.axisB = axis2;
        break;

      default:
        this.axisA = axis2;
        this.axisB = axis1;
        break;
    }
  }

  // // Getters
  public Double getArea() {
    final Double area;
    area = 3.14 * this.axisA * this.axisB;
    // Rounds decimal numbers
    return Math.round(area * 100) / 100D;
  }

  public Double getCircumference() {
    final Double circumference;
    final int condition;

    if (this.axisA == this.axisB) {
      condition = 1;
    } else {
      condition = 2;
    }

    switch (condition) {
      case 1:
        circumference = 2 * Math.PI * this.axisA;
        // Rounds decimal numbers
        return Math.round(circumference * 100) / 100D;

      default:
        circumference = Math.PI * (Math.sqrt(
            2 * (Math.pow(this.axisA, 2) + Math.pow(this.axisB, 2)) - Math.pow((this.axisA - this.axisB), 2) / 2));
        // Rounds decimal numbers
        return Math.round(circumference * 100) / 100D;
    }

  }

  @Override
  public String toString() {
    return "An ellipse with an area = " + this.getArea() + " and a circumference = " + this.getCircumference() + " is "
        + super.toString();
  }
}