public class Striker extends Football{
    
    public int goals,sot;
    public double p;
    
    public Striker(String s, int n1, int n2, int n3, int n4){
        super(s,n1,n2);
        this.goals=n3;
        this.sot=n4;
    }

    public void calculatePerformance(){
        this.p=this.goals/(this.sot*1.0);
        System.out.println("Performance: " + this.p);    
    }

    public void display(){
        super.display();
        System.out.println("Goals: " + this.goals);
        System.out.println("Shots on target: " + this.sot);    
    }
}