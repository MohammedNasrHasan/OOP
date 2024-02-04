
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	  Scanner s = new Scanner(System.in); 
	  
	  int a []={3,0,7,3,8,9};
	  int b=0;
	  int num;
	  
	  
	  while(true){
	  try{
	  System.out.println("Insert an integer number : ");
	    num = Integer.parseInt(s.nextLine());
	    b=(num/a[num]);
	    System.out.println("The result is :" + b );
	    break;
	    
	  }catch(NumberFormatException e){
	      System.out.println("invalid");
	  }catch(ArrayIndexOutOfBoundsException e){
	      System.out.println("Array out of bound ");
	  } catch (ArithmeticException e) {
        System.out.println("Division by zero");
    }
}
        System.out.println("End of program ");
}
}
