
import java.text.*;
import java.util.*;
public class AirplaneDistance
{
    public final double  t = 32.8;
    public final double vi= 0.0;
    private double y ;
    
    
    
public Airplanea(double y){
    
    this.y=y;
    
}
public double cd (){
    
    double d ;
    d=(vi *this.t)+0.5*this.y* Math.pow(t,2);
    return d;
}

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    double x =0.0;
	    
		System.out.println("Enter acceleration");
		x=s.nextDouble();
		Airplanea a = new Airplanea (x);
		System.out.println("distance traveled is :"+a.cd());
	}
}
