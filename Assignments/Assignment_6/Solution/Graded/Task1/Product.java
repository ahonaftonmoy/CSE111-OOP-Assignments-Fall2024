//Task1
public class Product{
    private String name;
    private double price;
    private int quantity;

    public Product(){
        this.name="Unknown";
        this.price=0.0;
        this.quantity=0;
    }

    public Product(String s, double d){
        this.name=s;
        this.price=d;
    }

    public void displayInfo(){
        System.out.println("Product Name: "+this.name+"\nPrice: $"+this.price);
    }

    public void setQuantity(int n){
        this.quantity=n;
    }

    public void displayInfo(boolean f){
        displayInfo();
        if(f){
            System.out.println("Quantity: "+this.quantity);
        }
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }
}