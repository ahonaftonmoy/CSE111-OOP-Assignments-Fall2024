public class Defender extends Football{
    
    public int tack,intcpt;
    public double p;
    
    public Defender(String s, int n1, int n2, int n3, int n4){
        super(s,n1,n2);
        this.tack=n3;
        this.intcpt=n4;
    }

    public void calculatePerformance(){
        this.p=this.intcpt/(this.tack*1.0);
        System.out.println("Performance: " + this.p);    
    }

    public void display(){
        super.display();
        System.out.println("Tackles: " + this.tack);
        System.out.println("Interceptions: " + this.intcpt);    
    }
}