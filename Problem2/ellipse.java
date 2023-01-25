package Problem2;

public class ellipse extends circle implements scaleable {
  protected Double axisA, axisB;

  ellipse() {
    super();
    this.axisA = 1.0;
    this.axisB = 1.0;
  }

  ellipse(Double axis1, Double axis2) {
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

  public Double Area() {
    final Double area;
    area = 3.14 * this.axisA * this.axisB;
    // Rounds decimal numbers
    return area;
  }

  public void ScaleDown(Double ratio) {
    System.out.println("Scale down by a factor of " + ratio);
    this.axisA = this.axisA * ratio;
    this.axisB = this.axisB * ratio;
  }

  public void ScaleUp(int ratio) {
    System.out.println("Scale up by a factor of " + ratio);
    this.axisA = this.axisA * ratio;
    this.axisB = this.axisB * ratio;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "An ellipse with the axis A= " + this.axisA + " B= " + this.axisB + "and an area = " + this.Area();
  }

}
