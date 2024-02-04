import java.util.*;
import java.text.*;


public class WindSpeed {
    
    private double temp;
    private double v;
public WindSpeed (double temp, double v){
    
    this.temp=temp;
    this.v=v;
}

public void settemp(double temp){
    
    this.temp=temp;
}
public void setb(double v){
    
    this.v=v;
}
public double windChillL(){
    
    double windChill=0.0;
    windChill = 35.74 + 0.6215*temp - 35.75*Math.pow(v,0.16) + 0.4275* temp *Math.pow(v,0.16);
    return windChill;
}
    
    

    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double speed=0.0;
        double temprature=0.0;
        
        while(true){
        try {  System.out.println("the temprature : ");
               temprature=s.nextDouble();
               if(temprature< -58 | temprature > 41){
                   throw new Exception();
               }
               System.out.println("Enter the wind speed : ");
                speed=s.nextDouble();
                if (speed<2){
                    
                throw new IllegalArgumentException();
                }
                WindSpeed air1 = new WindSpeed (temprature,speed);
                System.out.println(" The wind chill temp is : "+ df.format(air1.windChillL()));
                break;
        }catch(IllegalArgumentException em){
            
                System.out.println(" wind speeds below 2 mph ");
                s.nextLine();
        }catch(Exception e){
            
             System.out.println("temperatures below -58 ºF or above 41ºF");
        }
        
        }
        
    }
}
