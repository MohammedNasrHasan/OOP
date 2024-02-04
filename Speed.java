class Speed{
    private double inspeed;
    private double finalspeed;
    private double time;
public Speed(double inspeed,double finalspeed,double time){
    this.inspeed=inspeed;
    this.finalspeed=finalspeed;
    this.time=time;
}
public double accelartion(){
   this.finalspeed=finalspeed*(5.0/18.0);
   this.inspeed=inspeed*(5.0/18.0);
    
    return Math.abs((finalspeed - inspeed))/time;
}
public double convert(double x){
    
    return x*(5.0/18.0);
    
}
    
}