package Problem2;

public class circle extends shape implements scaleable {
  private double radius;

  circle() {
    super();
    this.radius = 1.0;
  }

  public circle(Double radius) {
    super();
    this.radius = radius;
  }

  public Double Area() {
    return (pi * this.radius * this.radius);
  }

  public void ScaleUp(int ratio) {
    System.out.println("Scale up by a factor of " + ratio);
    this.radius = this.radius * ratio;
  }

  @Override
  public void ScaleDown(Double ratio) {
    System.out.println("Scale down by a factor of " + ratio);
    this.radius = this.radius * ratio;
  }

  @Override
  public String toString() {
    return "A circle with the radius = " + this.radius + " and an area = " + this.Area();
  }
}
