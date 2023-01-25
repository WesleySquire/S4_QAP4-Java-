package Problem1;

class Circle extends Shape {
  protected Double myRadius;

  public Circle() {
    super();
    this.myRadius = 1.0;
  }

  public Circle(Double radius) {
    super();
    this.myRadius = radius;
  }

  public Circle(Double radius, String color, Boolean filled) {
    super(color, filled);
    this.myRadius = radius;
  }

  // Getters
  public Double getRadius() {
    return this.myRadius;
  }

  public Double getArea() {
    final Double area;
    area = Math.PI * (this.myRadius * this.myRadius);
    // Rounds decimal numbers
    return Math.round(area * 100) / 100D;
  }

  public Double getCircumference() {
    final Double circum;
    circum = 2 * (Math.PI * this.myRadius);
    // Rounds decimal numbers
    return Math.round(circum * 100) / 100D;
  }

  // Setters
  public void setRadius(Double radius) {
    this.myRadius = radius;
  }

  @Override
  public String toString() {
    return "A circle with an area = " + this.getArea() + " and a circumference = " + this.getCircumference() + " is "
        + super.toString();
  }
}
