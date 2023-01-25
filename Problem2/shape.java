package Problem2;

public abstract class shape implements scaleable {
  private String name, color;
  private boolean filled;

  shape() {
    this.name = " its a shape";
    this.color = "red";
    this.filled = true;
  }

  public shape(String color, Boolean filled) {
    this.name = " its a shape";
    this.color = color;
    this.filled = filled;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public String getColor() {
    return color;
  }

  public String getName() {
    return name;
  }

  public boolean getFilled() {
    return filled;
  }

  // Had to change this from a void to a double to get it to work in toString;
  public abstract Double Area();

  @Override
  public String toString() {
    return super.toString();
  }

}
