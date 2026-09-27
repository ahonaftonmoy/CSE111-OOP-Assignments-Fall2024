//Task2
public class Passenger{
    public static int no_of_passenger;
    public static double total_fare;
    public String name;
    public double distance, fare, bagweight;
    
    public Passenger(String s , double d){
        this.name=s;
        this.distance=d;
        this.fare=20*d;
        no_of_passenger++;
        total_fare+=this.fare;
    }

    public void passengerDetails(){
        System.out.println("Name: "+this.name+"\nFare: "+this.fare+" TK");
    }

    public void storeBaggageWeight(double d){
        this.bagweight=d;
        this.fare+=10*d;
        total_fare+=10*d;
    }
}