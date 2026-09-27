//Task2
public class Toy{
     public String name;
     public int price;
     public Toy(String s, int n){
          this.name=s;
          this.price=n;
          System.out.println("A new toy has been made!");
     }
     public void updateName(String s){
          System.out.println("Changhing old name: "+this.name);
          this.name=s;
          System.out.println("New name: "+this.name);
     }
     public void updatePrice(int n){
          this.price=n;
     }
     public void showPrice(){
          System.out.println("price: "+this.price+" Taka");
     }
}