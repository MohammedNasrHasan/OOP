
public class Main
{
	public static void main(String[] args) {
	    Account a = new Account(112,20000,4.5);
	    
	    a.withdraw(2500);
	    a.deposit(3000);
	    
	    
	    
		System.out.println(a.getbalance());
		System.out.println(a.getMonthlyIntrest());
		
		
		
	}
}
