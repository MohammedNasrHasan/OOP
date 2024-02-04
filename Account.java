class Account{
    
    private int id;
    private double balance;
    private double annualIntrestRate;
    

public Account (int id , double balance, double annualIntrestRate){
    
    this.id=id;
    this.balance=balance;
    this.annualIntrestRate=annualIntrestRate;
    
    
}
public Account (){
    
    this.id=0;
    this.balance=0;
    this.annualIntrestRate=0;
    
    
}
public void  setid(int id){
    
    this.id=id;
}
public int  getid(){
    
    return id ;
}

public void  setbalance(double balance){
    
    this.balance=balance;
}
public double  getbalance(){
    
    return balance ;
}
public void  setannualIntrestRate(double annualIntrestRate){
    
    this.annualIntrestRate=annualIntrestRate;
}
public double  getannualIntrestRate(){
    
    return annualIntrestRate ;
}

public double getMonthlyIntrestRate(){
     
return balance*(annualIntrestRate/12); 
     
}

public double getMonthlyIntrest(){
 
 return  balance*((annualIntrestRate/100)/12);
    
}
public void withdraw(double amount){
    
    
if(amount>balance){
    System.out.println("Insufficent balance");
}else{
    balance -= amount;
    System.out.println(balance);
}
}
public double deposit  (double amount2 ){
    
    
   return balance += amount2; 
}

}















