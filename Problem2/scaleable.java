package Problem2;

public interface scaleable {
  public static final double pi = Math.PI;

  public abstract void ScaleUp(int ratio);

  public void ScaleDown(Double ratio);

  default void displayFormula() {
    System.out.println("CircleArea = pi(r^2)");
  }
}
