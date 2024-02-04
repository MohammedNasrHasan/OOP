
import java.util.*;
import java.text.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner (System.in);
	    double x =0.0;
	    double z =0.0;
	    double y =0.0;
	    
	    
		System.out.println("Enter the initial speed in km/h : ");
		x=s.nextDouble();
		System.out.println("Enter the final speed in km/h : ");
		y=s.nextDouble();
		System.out.println("Enter the time speed in km/h : ");
		z=s.nextDouble();
		Speed s1 = new Speed(x,y,z);
		DecimalFormat D = new DecimalFormat("0.00"); 
        String finalSpeedFormatted = D.format(s1.convert(y));
        String accelerationFormatted = D.format(s1.accelartion());
        
        System.out.println("The initial speed in m/s: " +  D.format(s1.convert(x)));
        System.out.println("The final speed in m/s: " + finalSpeedFormatted);
        System.out.println("The acceleration: " + accelerationFormatted);
		
	}
}
