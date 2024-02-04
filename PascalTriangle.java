/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;


public class Pascal
{

  private double a;
  private double a2;
  private double f1;



  public Pascal (double a, double a2, double f1)
  {


    this.a = a;
    this.a2 = a2;
    this.f1 = f1;

  }
  public double cal ()
  {



    return f1 * (a2 / a);

  }



  public static void main (String[]args)
  {


    Scanner s = new Scanner (System.in);


    System.out.println ("Enter A1");
    double x = s.nextDouble ();
    System.out.println ("Enter A2");
    double d = s.nextDouble ();
    System.out.println ("Enter F1");
    double l = s.nextDouble ();

    Pascal p = new Pascal (x, d, l);

    System.out.println ("F2 is " + p.cal ());

  }
}
