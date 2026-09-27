//Task4
public class Circle{
    public static int count;
    private double radius;
    private double area;
    
    public Circle(int n){
        setRadius(n);
        count++;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(int n){
        this.radius=n/1.0;
    }

    public double area(){
        this.area=3.14159*Math.pow(this.radius,2);
        return this.area;
    }
}