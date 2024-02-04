
import java.util.*;
import java.text.*;
public class Force
{

  private double m;
  public final double radius = 6.37 * Math.pow (10, 6);
  public final double m2 = 5.97 * Math.pow (10, 24);
  public final double g = 6.67 * Math.pow (10, -11);

  public Force (double m)
  {
    this.m = m;
  }
  public double calculate ()
  {
    return g * this.m * m2 / (radius * radius);
  }
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    try
    {
      System.out.println ("Enter the mass of the person ");
      double a = s.nextDouble ();
      Force m = new Force (a);
      System.out.println ((int) m.calculate () + "N");
    } catch (InputMismatchException e)
    {
      System.out.println ("Wrong input ");
    }
  }
}
