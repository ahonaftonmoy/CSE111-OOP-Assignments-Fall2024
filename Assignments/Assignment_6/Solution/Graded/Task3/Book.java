//Task3
public class Book{
     public static int total_books_sold;
     public static double total_revenue;
     public String title;
     public double price=150;
     public double disc;

     
     public Book(String s, int n){
          this.title=s;
          this.disc=n;
          calculatePrice();
          total_books_sold++;
     }

     public double calculatePrice(){
          this.price*=(1-this.disc/100);
          total_revenue+=this.price;
          return this.price;
     }

     public void bookDetails(){
          System.out.println("Title: "+this.title+"\nPrice after Discount: "+this.price+" TK");
     }
}