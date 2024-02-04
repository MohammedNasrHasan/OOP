import java.util.*;


public class Airplane {
    
    private double a;
    private double v;
public Airplane (double a , double v){
    
    this.a=a;
    this.v=v;
}

public void seta(double a){
    
    this.a=a;
}
public void setb(double v){
    
    this.v=v;
}
public double runwayL(){
    
    double length=0.0;
    length = (v*v)/(2*a);
    return length;
}
    
    

    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        double speed=0.0;
        double accelaration=0.0;
        
        while(true){
        try {  System.out.println("Enter the speed : ");
               speed=s.nextDouble();
               System.out.println("Enter the accelaration : ");
                accelaration=s.nextDouble();
                if (accelaration==0){
                    
                throw new ArithmeticException();
                }
                Airplane air1 = new Airplane (accelaration,speed);
                System.out.println(" The total runway length is "+ air1.runwayL());
                break;
        }catch(InputMismatchException em){
            
                System.out.println(" non-numerical value entered ");
                s.nextLine();
        }catch(ArithmeticException e){
            
             System.out.println("division by zero occurred");
        }
        
        }
        
    }
}
